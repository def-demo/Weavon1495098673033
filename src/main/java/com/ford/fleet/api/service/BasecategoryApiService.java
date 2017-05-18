package com.ford.fleet.api.service;

import com.ford.fleet.models.Basecategory;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface BasecategoryApiService {
  
      List<Basecategory> findAllBasecategory()
      throws NotFoundException;
  
      Basecategory updateBasecategory(Basecategory basecategory)
      throws NotFoundException;
  
      Basecategory addBasecategory(Basecategory basecategory)
      throws NotFoundException;
  
      Basecategory findByIdBasecategory(Integer id)
      throws NotFoundException;
  
      void deleteBasecategory(Integer id)
      throws NotFoundException;
  
}

