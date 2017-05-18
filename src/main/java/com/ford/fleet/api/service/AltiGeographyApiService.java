package com.ford.fleet.api.service;

import com.ford.fleet.models.AltiGeography;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface AltiGeographyApiService {
  
      List<AltiGeography> findAllAltiGeography()
      throws NotFoundException;
  
      AltiGeography updateAltiGeography(AltiGeography altiGeography)
      throws NotFoundException;
  
      AltiGeography addAltiGeography(AltiGeography altiGeography)
      throws NotFoundException;
  
      AltiGeography findByIdAltiGeography(Integer id)
      throws NotFoundException;
  
      void deleteAltiGeography(Integer id)
      throws NotFoundException;
  
}

