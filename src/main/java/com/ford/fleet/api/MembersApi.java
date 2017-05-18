package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.MembersApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.Members;


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

public class MembersApi {

   @Autowired
   private MembersApiService service;
  

  @RequestMapping(value = "/members", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<Members>> findAllMembers()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<Members>>(service.findAllMembers(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/members", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< Members> updateMembers(@RequestBody Members members
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Members>(service.updateMembers(members), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/members", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< Members> addMembers(@RequestBody Members members
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Members>(service.addMembers(members), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/members/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< Members> findByIdMembers(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<Members>(service.findByIdMembers(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/members/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteMembers(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteMembers(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

