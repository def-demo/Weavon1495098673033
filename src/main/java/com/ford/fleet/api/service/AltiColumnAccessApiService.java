package com.ford.fleet.api.service;

import com.ford.fleet.models.AltiColumnAccess;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface AltiColumnAccessApiService {
  
      List<AltiColumnAccess> findAllAltiColumnAccess()
      throws NotFoundException;
  
      AltiColumnAccess updateAltiColumnAccess(AltiColumnAccess altiColumnAccess)
      throws NotFoundException;
  
      AltiColumnAccess addAltiColumnAccess(AltiColumnAccess altiColumnAccess)
      throws NotFoundException;
  
      AltiColumnAccess findByIdAltiColumnAccess(Integer id)
      throws NotFoundException;
  
      void deleteAltiColumnAccess(Integer id)
      throws NotFoundException;
  
}

