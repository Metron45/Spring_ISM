package io.swagger.api;

import io.swagger.model.Event;
import io.swagger.model.Participant;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-03-31T11:11:07.248176+02:00[Europe/Warsaw]")
@Controller
public class BrowseApiController implements BrowseApi {

    private static final Logger log = LoggerFactory.getLogger(BrowseApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public BrowseApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Object> browseEventIDGet(@Min(1)@ApiParam(value = "The ID of user created Event.",required=true, allowableValues="") @PathVariable("EventID") Integer eventID
) {
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

    public ResponseEntity<List<Participant>> browseEventIDParticipateGet(@Min(1)@ApiParam(value = "The ID of user created Event.",required=true, allowableValues="") @PathVariable("EventID") Integer eventID
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Participant>>(objectMapper.readValue("[ {\n  \"image\" : { },\n  \"qualified\" : true,\n  \"password\" : \"password\",\n  \"surname\" : \"surname\",\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"Id\" : 6,\n  \"participantInfo\" : \"participantInfo\",\n  \"email\" : \"email\"\n}, {\n  \"image\" : { },\n  \"qualified\" : true,\n  \"password\" : \"password\",\n  \"surname\" : \"surname\",\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"Id\" : 6,\n  \"participantInfo\" : \"participantInfo\",\n  \"email\" : \"email\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Participant>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Participant>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> browseEventIDParticipatePost(@Min(1)@ApiParam(value = "The ID of user created Event.",required=true, allowableValues="") @PathVariable("EventID") Integer eventID
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Object> browseEventIDPost(@ApiParam(value = "Event updated info" ,required=true )  @Valid @RequestBody Event body
,@Min(1)@ApiParam(value = "The ID of user created Event.",required=true, allowableValues="") @PathVariable("EventID") Integer eventID
) {
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

    public ResponseEntity<List<Event>> browseGet(@ApiParam(value = "User specified search criteria" ,required=true )  @Valid @RequestBody Event body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Event>>(objectMapper.readValue("[ {\n  \"date\" : \"date\",\n  \"image\" : { },\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"location\" : \"location\",\n  \"punctation\" : { },\n  \"Id\" : 0,\n  \"eventType\" : \"eventType\",\n  \"ticketSales\" : { },\n  \"mailingList\" : \"mailingList\",\n  \"participans\" : [ {\n    \"image\" : { },\n    \"qualified\" : true,\n    \"password\" : \"password\",\n    \"surname\" : \"surname\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"Id\" : 6,\n    \"participantInfo\" : \"participantInfo\",\n    \"email\" : \"email\"\n  }, {\n    \"image\" : { },\n    \"qualified\" : true,\n    \"password\" : \"password\",\n    \"surname\" : \"surname\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"Id\" : 6,\n    \"participantInfo\" : \"participantInfo\",\n    \"email\" : \"email\"\n  } ]\n}, {\n  \"date\" : \"date\",\n  \"image\" : { },\n  \"name\" : \"name\",\n  \"description\" : \"description\",\n  \"location\" : \"location\",\n  \"punctation\" : { },\n  \"Id\" : 0,\n  \"eventType\" : \"eventType\",\n  \"ticketSales\" : { },\n  \"mailingList\" : \"mailingList\",\n  \"participans\" : [ {\n    \"image\" : { },\n    \"qualified\" : true,\n    \"password\" : \"password\",\n    \"surname\" : \"surname\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"Id\" : 6,\n    \"participantInfo\" : \"participantInfo\",\n    \"email\" : \"email\"\n  }, {\n    \"image\" : { },\n    \"qualified\" : true,\n    \"password\" : \"password\",\n    \"surname\" : \"surname\",\n    \"name\" : \"name\",\n    \"description\" : \"description\",\n    \"Id\" : 6,\n    \"participantInfo\" : \"participantInfo\",\n    \"email\" : \"email\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Event>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Event>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
