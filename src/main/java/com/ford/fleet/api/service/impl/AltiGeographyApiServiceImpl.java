package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.AltiGeography;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class AltiGeographyApiServiceImpl implements AltiGeographyApiService {
		  	  
	  @Autowired
	
  	  private AltiGeographyRepository  altiGeographyRepository ;
	   
  
  
				
			
      @Override
      public List<AltiGeography> findAllAltiGeography()
      throws NotFoundException {
      
        
  		
  		
  			return altiGeographyRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiGeography updateAltiGeography(AltiGeography altiGeography)
      throws NotFoundException {
      
         
        	return altiGeographyRepository.save(altiGeography);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiGeography addAltiGeography(AltiGeography altiGeography)
      throws NotFoundException {
      
         
        	return altiGeographyRepository.save(altiGeography);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiGeography findByIdAltiGeography(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return altiGeographyRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteAltiGeography(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

