package io.swagger.api;

import io.swagger.model.Register;
import io.swagger.model.User;
import io.swagger.service.UserService;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
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
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-31T11:11:07.248176+02:00[Europe/Warsaw]")
@Controller
public class RegisterApiController implements RegisterApi {
	
	@Autowired
	private UserService userService;

    private static final Logger log = LoggerFactory.getLogger(RegisterApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegisterApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Integer> registerPost(
    		@ApiParam(value = "User object needed to be added into system." ,required=true )
    		@Valid @RequestBody User body) 
    {
        String accept = request.getHeader("Accept");
        int id = -1;
        if (accept != null && accept.contains("application/json")) {
            id = userService.addUser(body).getId();
			return new ResponseEntity<Integer>(
					id,
					//objectMapper.readValue(id , Integer.class),
					HttpStatus.OK);
        }

        return new ResponseEntity<Integer>(HttpStatus.NOT_IMPLEMENTED);
	}

	@Override
	public ResponseEntity<Integer> registerPost(Register body) {
		// TODO Auto-generated method stub
		return null;
	}
}


