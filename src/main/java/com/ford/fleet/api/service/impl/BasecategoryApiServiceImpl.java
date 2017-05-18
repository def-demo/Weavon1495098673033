package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.Basecategory;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class BasecategoryApiServiceImpl implements BasecategoryApiService {
		  	  
	  @Autowired
	
  	  private BasecategoryRepository  basecategoryRepository ;
	   
  
  
				
			
      @Override
      public List<Basecategory> findAllBasecategory()
      throws NotFoundException {
      
        
  		
  		
  			return basecategoryRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Basecategory updateBasecategory(Basecategory basecategory)
      throws NotFoundException {
      
         
        	return basecategoryRepository.save(basecategory);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Basecategory addBasecategory(Basecategory basecategory)
      throws NotFoundException {
      
         
        	return basecategoryRepository.save(basecategory);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public Basecategory findByIdBasecategory(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return basecategoryRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteBasecategory(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

