package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.Members;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class MembersApiServiceImpl implements MembersApiService {
		  	  
	  @Autowired
	
  	  private MembersRepository  membersRepository ;
	   
  
  
				
			
      @Override
      public List<Members> findAllMembers()
      throws NotFoundException {
      
        
  		
  		
  			return membersRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Members updateMembers(Members members)
      throws NotFoundException {
      
         
        	return membersRepository.save(members);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Members addMembers(Members members)
      throws NotFoundException {
      
         
        	return membersRepository.save(members);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Members findByIdMembers(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return membersRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteMembers(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

