package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.AltiGeographyApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.AltiGeography;


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

public class AltiGeographyApi {

   @Autowired
   private AltiGeographyApiService service;
  

  @RequestMapping(value = "/alti_geography", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<AltiGeography>> findAllAltiGeography()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<AltiGeography>>(service.findAllAltiGeography(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_geography", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< AltiGeography> updateAltiGeography(@RequestBody AltiGeography altiGeography
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiGeography>(service.updateAltiGeography(altiGeography), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_geography", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< AltiGeography> addAltiGeography(@RequestBody AltiGeography altiGeography
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiGeography>(service.addAltiGeography(altiGeography), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_geography/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< AltiGeography> findByIdAltiGeography(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiGeography>(service.findByIdAltiGeography(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_geography/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteAltiGeography(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteAltiGeography(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

