package io.swagger.api;

import io.swagger.model.User;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.service.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-31T11:11:07.248176+02:00[Europe/Warsaw]")
@Controller
public class RegisterApiController implements RegisterApi {
	
	@Autowired
	private UserService userService;

    //private static final Logger log = LoggerFactory.getLogger(RegisterApiController.class);

    //private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RegisterApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        //this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Long> registerPost(
    		@ApiParam(value = "User object needed to be added into system." , required=true )
    		@Valid @RequestBody User body) 
    {
        String accept = request.getHeader("Accept");
        Long id = Long.valueOf(-1);
        User user;
        if (accept != null && accept.contains("application/json")) {
            id = userService.addUser(body).getId();
            System.out.println("User added:" + body.toString());
            user = userService.findById(id);
            System.out.println("User in Database:" + user.toString());
			return new ResponseEntity<Long>(id, HttpStatus.OK);
        }

        return new ResponseEntity<Long>(HttpStatus.NOT_IMPLEMENTED);
	}

}


