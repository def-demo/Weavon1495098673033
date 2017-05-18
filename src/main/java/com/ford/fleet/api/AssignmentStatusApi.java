package com.ford.fleet.api;

import com.ford.fleet.models.*;

import com.ford.fleet.api.service.AssignmentStatusApiService;

import com.ford.fleet.exception.NotFoundException;

import com.ford.fleet.models.AssignmentStatus;


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

public class AssignmentStatusApi {

   @Autowired
   private AssignmentStatusApiService service;
  

  @RequestMapping(value = "/assignment_status", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<AssignmentStatus>> findAllAssignmentStatus()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<AssignmentStatus>>(service.findAllAssignmentStatus(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/assignment_status", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< AssignmentStatus> updateAssignmentStatus(@RequestBody AssignmentStatus assignmentStatus
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AssignmentStatus>(service.updateAssignmentStatus(assignmentStatus), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/assignment_status", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< AssignmentStatus> addAssignmentStatus(@RequestBody AssignmentStatus assignmentStatus
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AssignmentStatus>(service.addAssignmentStatus(assignmentStatus), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/assignment_status/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< AssignmentStatus> findByIdAssignmentStatus(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<AssignmentStatus>(service.findByIdAssignmentStatus(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/assignment_status/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteAssignmentStatus(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteAssignmentStatus(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

