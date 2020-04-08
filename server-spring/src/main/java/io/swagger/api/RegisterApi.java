/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.18).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.validation.Valid;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-31T11:11:07.248176+02:00[Europe/Warsaw]")
@Api(value = "User", description = "the register API")
public interface RegisterApi {

    @ApiOperation(value = "Register new user.",
    		nickname = "registerPost",
    		notes = "", response = Integer.class, tags={  }
    		)
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returns an ID of newly created user.", response = Integer.class),
        @ApiResponse(code = 400, message = "Invalid input") })
    @RequestMapping(value = "/register",
        produces = { "*/*" }, 
        consumes = { "*/*" },
        method = RequestMethod.GET)
    ResponseEntity<Long> registerPost(
    		@ApiParam(value = "User object needed to be added into system." ,required=true )
    		@Valid @RequestBody User body
    		);

}
