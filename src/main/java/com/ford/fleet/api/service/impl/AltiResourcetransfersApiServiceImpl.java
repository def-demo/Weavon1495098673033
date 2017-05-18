package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.AltiResourcetransfers;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class AltiResourcetransfersApiServiceImpl implements AltiResourcetransfersApiService {
		  	  
	  @Autowired
	
  	  private AltiResourcetransfersRepository  altiResourcetransfersRepository ;
	   
  
  
				
			
      @Override
      public List<AltiResourcetransfers> findAllAltiResourcetransfers()
      throws NotFoundException {
      
        
  		
  		
  			return altiResourcetransfersRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiResourcetransfers updateAltiResourcetransfers(AltiResourcetransfers altiResourcetransfers)
      throws NotFoundException {
      
         
        	return altiResourcetransfersRepository.save(altiResourcetransfers);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiResourcetransfers addAltiResourcetransfers(AltiResourcetransfers altiResourcetransfers)
      throws NotFoundException {
      
         
        	return altiResourcetransfersRepository.save(altiResourcetransfers);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiResourcetransfers findByIdAltiResourcetransfers(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return altiResourcetransfersRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteAltiResourcetransfers(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

