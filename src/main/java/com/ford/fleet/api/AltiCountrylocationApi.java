package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.AltiCountrylocationApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.AltiCountrylocation;


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

public class AltiCountrylocationApi {

   @Autowired
   private AltiCountrylocationApiService service;
  

  @RequestMapping(value = "/alti_countrylocation", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<AltiCountrylocation>> findAllAltiCountrylocation()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<AltiCountrylocation>>(service.findAllAltiCountrylocation(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_countrylocation", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< AltiCountrylocation> updateAltiCountrylocation(@RequestBody AltiCountrylocation altiCountrylocation
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiCountrylocation>(service.updateAltiCountrylocation(altiCountrylocation), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_countrylocation", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< AltiCountrylocation> addAltiCountrylocation(@RequestBody AltiCountrylocation altiCountrylocation
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiCountrylocation>(service.addAltiCountrylocation(altiCountrylocation), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_countrylocation/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< AltiCountrylocation> findByIdAltiCountrylocation(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiCountrylocation>(service.findByIdAltiCountrylocation(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_countrylocation/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteAltiCountrylocation(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteAltiCountrylocation(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

