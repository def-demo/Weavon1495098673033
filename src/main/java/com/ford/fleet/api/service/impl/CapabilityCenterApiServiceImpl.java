package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.CapabilityCenter;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class CapabilityCenterApiServiceImpl implements CapabilityCenterApiService {
		  	  
	  @Autowired
	
  	  private CapabilityCenterRepository  capabilityCenterRepository ;
	   
  
  
				
			
      @Override
      public List<CapabilityCenter> findAllCapabilityCenter()
      throws NotFoundException {
      
        
  		
  		
  			return capabilityCenterRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public CapabilityCenter updateCapabilityCenter(CapabilityCenter capabilityCenter)
      throws NotFoundException {
      
         
        	return capabilityCenterRepository.save(capabilityCenter);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public CapabilityCenter addCapabilityCenter(CapabilityCenter capabilityCenter)
      throws NotFoundException {
      
         
        	return capabilityCenterRepository.save(capabilityCenter);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public CapabilityCenter findByIdCapabilityCenter(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return capabilityCenterRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteCapabilityCenter(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

