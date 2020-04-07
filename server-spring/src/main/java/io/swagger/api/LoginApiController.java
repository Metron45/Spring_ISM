package io.swagger.api;


import io.swagger.model.User;
import io.swagger.service.UserService;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;


import javax.servlet.http.HttpServletRequest;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-31T11:11:07.248176+02:00[Europe/Warsaw]")
@Controller
public class LoginApiController implements LoginApi {

	@Autowired
	private UserService userService;
    //private static final Logger log = LoggerFactory.getLogger(LoginApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public LoginApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

	@Override
	public ResponseEntity<User> loginGet(User body) {
		 String accept = request.getHeader("Accept");
		 User user;
		 if (accept != null && accept.contains("application/json")) {
			 	user = userService.loginUser(body.getEmail(),body.getPassword());
				return new ResponseEntity<User>(user,
						HttpStatus.OK
						);
	     }
		return null;
	}

}
