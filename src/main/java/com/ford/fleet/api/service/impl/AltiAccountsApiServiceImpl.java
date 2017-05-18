package com.ford.fleet.api.service.impl;

import com.ford.fleet.api.service.*;
import com.ford.fleet.models.*;
import org.springframework.stereotype.Service;
import com.ford.fleet.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ford.fleet.models.AltiAccounts;


import java.util.List;
import com.ford.fleet.exception.NotFoundException;


@Service
@Transactional
public class AltiAccountsApiServiceImpl implements AltiAccountsApiService {
		  	  
	  @Autowired
	
  	  private AltiAccountsRepository  altiAccountsRepository ;
	   
  
  
				
			
      @Override
      public List<AltiAccounts> findAllAltiAccounts()
      throws NotFoundException {
      
        
  		
  		
  			return altiAccountsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiAccounts updateAltiAccounts(AltiAccounts altiAccounts)
      throws NotFoundException {
      
         
        	return altiAccountsRepository.save(altiAccounts);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiAccounts addAltiAccounts(AltiAccounts altiAccounts)
      throws NotFoundException {
      
         
        	return altiAccountsRepository.save(altiAccounts);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public AltiAccounts findByIdAltiAccounts(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return altiAccountsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteAltiAccounts(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

