package io.swagger.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.User;
import io.swagger.service.UserService;
import aspects.Storage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-31T11:11:07.248176+02:00[Europe/Warsaw]")
@Controller
public class AccountsApiController implements AccountsApi {

	@Autowired
	private UserService userService;
	
    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

	@Override
	public ResponseEntity<User> accountsUserIDGet(
    		@Min(1)@ApiParam(value = "The user ID.",required=true, allowableValues="") 
    		 Long id
    		)
	{
        String accept = request.getHeader("Accept");
        User user;
        System.out.println("ID Received:" + id );
        if (accept != null && accept.contains("application/json")) {
        		user = userService.findById(id);
        		System.out.println("User found:" + user.toString());
                return new ResponseEntity<User>(user, HttpStatus.OK);
        }

        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

	@Override
	public ResponseEntity<Object> accountsUserIDPost(@Min(1) User user) {
		String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Object>(objectMapper.readValue("{ }", Object.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Object>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<String> accountsUserTimeGet(Long id) {
		
		LocalDateTime loginTime = Storage.getLoginTime().get(id.intValue());
		return new ResponseEntity<String>(loginTime.toString(), HttpStatus.OK);
	}

}
