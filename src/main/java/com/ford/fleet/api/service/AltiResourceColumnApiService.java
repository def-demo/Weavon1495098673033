package com.ford.fleet.api.service;

import com.ford.fleet.models.AltiResourceColumn;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface AltiResourceColumnApiService {
  
      List<AltiResourceColumn> findAllAltiResourceColumn()
      throws NotFoundException;
  
      AltiResourceColumn updateAltiResourceColumn(AltiResourceColumn altiResourceColumn)
      throws NotFoundException;
  
      AltiResourceColumn addAltiResourceColumn(AltiResourceColumn altiResourceColumn)
      throws NotFoundException;
  
      AltiResourceColumn findByIdAltiResourceColumn(Integer id)
      throws NotFoundException;
  
      void deleteAltiResourceColumn(Integer id)
      throws NotFoundException;
  
}

