package com.bank.xyz.api;


import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2019-02-21T10:34:32.613Z")

@Api(value = "XDemo", description = "the XDemo API")
public interface XDemoApi {

    @ApiOperation(value = "XDemo", notes = "XDemo", response = String.class, tags={ "XDemo", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "ok", response = String.class),
        @ApiResponse(code = 400, message = "fail", response = String.class) })
    @RequestMapping(value = "/XDemo",
        produces = { "application/json" }, 
        consumes = { "text/plain" },
        method = RequestMethod.GET)
    default ResponseEntity<String> xDemo(@ApiParam(value = "", required = true) @RequestParam(value = "id", required = true) String id



) {
        // do some magic!
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
