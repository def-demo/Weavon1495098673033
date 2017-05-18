package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.AltiAccountsApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.AltiAccounts;


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

public class AltiAccountsApi {

   @Autowired
   private AltiAccountsApiService service;
  

  @RequestMapping(value = "/alti_accounts", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<AltiAccounts>> findAllAltiAccounts()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<AltiAccounts>>(service.findAllAltiAccounts(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_accounts", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< AltiAccounts> updateAltiAccounts(@RequestBody AltiAccounts altiAccounts
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiAccounts>(service.updateAltiAccounts(altiAccounts), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_accounts", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< AltiAccounts> addAltiAccounts(@RequestBody AltiAccounts altiAccounts
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiAccounts>(service.addAltiAccounts(altiAccounts), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_accounts/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< AltiAccounts> findByIdAltiAccounts(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AltiAccounts>(service.findByIdAltiAccounts(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/alti_accounts/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteAltiAccounts(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteAltiAccounts(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

