package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.AltiColumnAccessApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.AltiColumnAccess;


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

public class AltiColumnAccessApi {

   @Autowired
   private AltiColumnAccessApiService service;
  

  @RequestMapping(value = "/alti_column_access", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<AltiColumnAccess>> findAllAltiColumnAccess()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<AltiColumnAccess>>(service.findAllAltiColumnAccess(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_column_access", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< AltiColumnAccess> updateAltiColumnAccess(@RequestBody AltiColumnAccess altiColumnAccess
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiColumnAccess>(service.updateAltiColumnAccess(altiColumnAccess), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_column_access", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< AltiColumnAccess> addAltiColumnAccess(@RequestBody AltiColumnAccess altiColumnAccess
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiColumnAccess>(service.addAltiColumnAccess(altiColumnAccess), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_column_access/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< AltiColumnAccess> findByIdAltiColumnAccess(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiColumnAccess>(service.findByIdAltiColumnAccess(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_column_access/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteAltiColumnAccess(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteAltiColumnAccess(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

