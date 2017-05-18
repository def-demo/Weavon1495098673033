package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.AltiAdmin;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class AltiAdminApiServiceImpl implements AltiAdminApiService {
		  	  
	  @Autowired
	
  	  private AltiAdminRepository  altiAdminRepository ;
	   
  
  
				
			
      @Override
      public List<AltiAdmin> findAllAltiAdmin()
      throws NotFoundException {
      
        
  		
  		
  			return altiAdminRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiAdmin updateAltiAdmin(AltiAdmin altiAdmin)
      throws NotFoundException {
      
         
        	return altiAdminRepository.save(altiAdmin);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiAdmin addAltiAdmin(AltiAdmin altiAdmin)
      throws NotFoundException {
      
         
        	return altiAdminRepository.save(altiAdmin);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiAdmin findByIdAltiAdmin(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return altiAdminRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteAltiAdmin(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

