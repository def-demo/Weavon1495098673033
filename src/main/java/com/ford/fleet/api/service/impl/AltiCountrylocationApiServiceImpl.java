package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.AltiCountrylocation;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class AltiCountrylocationApiServiceImpl implements AltiCountrylocationApiService {
		  	  
	  @Autowired
	
  	  private AltiCountrylocationRepository  altiCountrylocationRepository ;
	   
  
  
				
			
      @Override
      public List<AltiCountrylocation> findAllAltiCountrylocation()
      throws NotFoundException {
      
        
  		
  		
  			return altiCountrylocationRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiCountrylocation updateAltiCountrylocation(AltiCountrylocation altiCountrylocation)
      throws NotFoundException {
      
         
        	return altiCountrylocationRepository.save(altiCountrylocation);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiCountrylocation addAltiCountrylocation(AltiCountrylocation altiCountrylocation)
      throws NotFoundException {
      
         
        	return altiCountrylocationRepository.save(altiCountrylocation);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiCountrylocation findByIdAltiCountrylocation(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return altiCountrylocationRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteAltiCountrylocation(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

