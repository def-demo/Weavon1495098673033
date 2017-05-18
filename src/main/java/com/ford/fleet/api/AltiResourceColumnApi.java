package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.AltiResourceColumnApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.AltiResourceColumn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class AltiResourceColumnApi {

   @Autowired
   private AltiResourceColumnApiService service;
  

  @RequestMapping(value = "/alti_resource_column", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<AltiResourceColumn>> findAllAltiResourceColumn()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<AltiResourceColumn>>(service.findAllAltiResourceColumn(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_resource_column", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< AltiResourceColumn> updateAltiResourceColumn(@RequestBody AltiResourceColumn altiResourceColumn
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiResourceColumn>(service.updateAltiResourceColumn(altiResourceColumn), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_resource_column", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< AltiResourceColumn> addAltiResourceColumn(@RequestBody AltiResourceColumn altiResourceColumn
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiResourceColumn>(service.addAltiResourceColumn(altiResourceColumn), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_resource_column/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< AltiResourceColumn> findByIdAltiResourceColumn(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiResourceColumn>(service.findByIdAltiResourceColumn(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_resource_column/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteAltiResourceColumn(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteAltiResourceColumn(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

