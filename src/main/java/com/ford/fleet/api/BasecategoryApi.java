package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.BasecategoryApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.Basecategory;


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

public class BasecategoryApi {

   @Autowired
   private BasecategoryApiService service;
  

  @RequestMapping(value = "/basecategory", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Basecategory>> findAllBasecategory()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Basecategory>>(service.findAllBasecategory(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/basecategory", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Basecategory> updateBasecategory(@RequestBody Basecategory basecategory
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Basecategory>(service.updateBasecategory(basecategory), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/basecategory", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Basecategory> addBasecategory(@RequestBody Basecategory basecategory
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Basecategory>(service.addBasecategory(basecategory), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/basecategory/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Basecategory> findByIdBasecategory(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Basecategory>(service.findByIdBasecategory(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/basecategory/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteBasecategory(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteBasecategory(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

