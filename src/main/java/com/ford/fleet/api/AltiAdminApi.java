package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.AltiAdminApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.AltiAdmin;


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

public class AltiAdminApi {

   @Autowired
   private AltiAdminApiService service;
  

  @RequestMapping(value = "/alti_admin", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<AltiAdmin>> findAllAltiAdmin()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<AltiAdmin>>(service.findAllAltiAdmin(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_admin", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< AltiAdmin> updateAltiAdmin(@RequestBody AltiAdmin altiAdmin
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiAdmin>(service.updateAltiAdmin(altiAdmin), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_admin", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< AltiAdmin> addAltiAdmin(@RequestBody AltiAdmin altiAdmin
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiAdmin>(service.addAltiAdmin(altiAdmin), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_admin/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< AltiAdmin> findByIdAltiAdmin(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiAdmin>(service.findByIdAltiAdmin(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_admin/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteAltiAdmin(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteAltiAdmin(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

