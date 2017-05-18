package com.ford.fleet.api.service;

import com.ford.fleet.models.AltiAccounts;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface AltiAccountsApiService {
  
      List<AltiAccounts> findAllAltiAccounts()
      throws NotFoundException;
  
      AltiAccounts updateAltiAccounts(AltiAccounts altiAccounts)
      throws NotFoundException;
  
      AltiAccounts addAltiAccounts(AltiAccounts altiAccounts)
      throws NotFoundException;
  
      AltiAccounts findByIdAltiAccounts(Integer id)
      throws NotFoundException;
  
      void deleteAltiAccounts(Integer id)
      throws NotFoundException;
  
}

