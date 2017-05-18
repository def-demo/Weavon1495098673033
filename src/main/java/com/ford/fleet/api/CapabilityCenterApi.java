package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.CapabilityCenterApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.CapabilityCenter;


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

public class CapabilityCenterApi {

   @Autowired
   private CapabilityCenterApiService service;
  

  @RequestMapping(value = "/capability_center", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<CapabilityCenter>> findAllCapabilityCenter()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<CapabilityCenter>>(service.findAllCapabilityCenter(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/capability_center", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< CapabilityCenter> updateCapabilityCenter(@RequestBody CapabilityCenter capabilityCenter
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<CapabilityCenter>(service.updateCapabilityCenter(capabilityCenter), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/capability_center", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< CapabilityCenter> addCapabilityCenter(@RequestBody CapabilityCenter capabilityCenter
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<CapabilityCenter>(service.addCapabilityCenter(capabilityCenter), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/capability_center/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< CapabilityCenter> findByIdCapabilityCenter(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<CapabilityCenter>(service.findByIdCapabilityCenter(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/capability_center/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteCapabilityCenter(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteCapabilityCenter(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

