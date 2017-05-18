package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.AltiResourceColumn;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class AltiResourceColumnApiServiceImpl implements AltiResourceColumnApiService {
		  	  
	  @Autowired
	
  	  private AltiResourceColumnRepository  altiResourceColumnRepository ;
	   
  
  
				
			
      @Override
      public List<AltiResourceColumn> findAllAltiResourceColumn()
      throws NotFoundException {
      
        
  		
  		
  			return altiResourceColumnRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiResourceColumn updateAltiResourceColumn(AltiResourceColumn altiResourceColumn)
      throws NotFoundException {
      
         
        	return altiResourceColumnRepository.save(altiResourceColumn);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiResourceColumn addAltiResourceColumn(AltiResourceColumn altiResourceColumn)
      throws NotFoundException {
      
         
        	return altiResourceColumnRepository.save(altiResourceColumn);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiResourceColumn findByIdAltiResourceColumn(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return altiResourceColumnRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteAltiResourceColumn(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

