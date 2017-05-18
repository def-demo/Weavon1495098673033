package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.AltiResourcetransfersApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.AltiResourcetransfers;


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

public class AltiResourcetransfersApi {

   @Autowired
   private AltiResourcetransfersApiService service;
  

  @RequestMapping(value = "/alti_resourcetransfers", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<AltiResourcetransfers>> findAllAltiResourcetransfers()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<AltiResourcetransfers>>(service.findAllAltiResourcetransfers(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_resourcetransfers", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< AltiResourcetransfers> updateAltiResourcetransfers(@RequestBody AltiResourcetransfers altiResourcetransfers
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiResourcetransfers>(service.updateAltiResourcetransfers(altiResourcetransfers), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_resourcetransfers", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< AltiResourcetransfers> addAltiResourcetransfers(@RequestBody AltiResourcetransfers altiResourcetransfers
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiResourcetransfers>(service.addAltiResourcetransfers(altiResourcetransfers), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_resourcetransfers/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< AltiResourcetransfers> findByIdAltiResourcetransfers(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiResourcetransfers>(service.findByIdAltiResourcetransfers(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_resourcetransfers/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteAltiResourcetransfers(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteAltiResourcetransfers(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

