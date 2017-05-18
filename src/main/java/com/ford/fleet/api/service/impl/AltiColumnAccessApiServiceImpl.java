package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.AltiColumnAccess;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class AltiColumnAccessApiServiceImpl implements AltiColumnAccessApiService {
		  	  
	  @Autowired
	
  	  private AltiColumnAccessRepository  altiColumnAccessRepository ;
	   
  
  
				
			
      @Override
      public List<AltiColumnAccess> findAllAltiColumnAccess()
      throws NotFoundException {
      
        
  		
  		
  			return altiColumnAccessRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiColumnAccess updateAltiColumnAccess(AltiColumnAccess altiColumnAccess)
      throws NotFoundException {
      
         
        	return altiColumnAccessRepository.save(altiColumnAccess);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiColumnAccess addAltiColumnAccess(AltiColumnAccess altiColumnAccess)
      throws NotFoundException {
      
         
        	return altiColumnAccessRepository.save(altiColumnAccess);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiColumnAccess findByIdAltiColumnAccess(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return altiColumnAccessRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteAltiColumnAccess(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

