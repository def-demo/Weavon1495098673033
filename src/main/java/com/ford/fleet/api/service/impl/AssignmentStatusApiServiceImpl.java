package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.AssignmentStatus;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class AssignmentStatusApiServiceImpl implements AssignmentStatusApiService {
		  	  
	  @Autowired
	
  	  private AssignmentStatusRepository  assignmentStatusRepository ;
	   
  
  
				
			
      @Override
      public List<AssignmentStatus> findAllAssignmentStatus()
      throws NotFoundException {
      
        
  		
  		
  			return assignmentStatusRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AssignmentStatus updateAssignmentStatus(AssignmentStatus assignmentStatus)
      throws NotFoundException {
      
         
        	return assignmentStatusRepository.save(assignmentStatus);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AssignmentStatus addAssignmentStatus(AssignmentStatus assignmentStatus)
      throws NotFoundException {
      
         
        	return assignmentStatusRepository.save(assignmentStatus);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AssignmentStatus findByIdAssignmentStatus(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return assignmentStatusRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteAssignmentStatus(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

