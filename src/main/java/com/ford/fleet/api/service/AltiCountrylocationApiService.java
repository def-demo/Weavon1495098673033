package com.ford.fleet.api.service;

import com.ford.fleet.models.AltiCountrylocation;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface AltiCountrylocationApiService {
  
      List<AltiCountrylocation> findAllAltiCountrylocation()
      throws NotFoundException;
  
      AltiCountrylocation updateAltiCountrylocation(AltiCountrylocation altiCountrylocation)
      throws NotFoundException;
  
      AltiCountrylocation addAltiCountrylocation(AltiCountrylocation altiCountrylocation)
      throws NotFoundException;
  
      AltiCountrylocation findByIdAltiCountrylocation(Integer id)
      throws NotFoundException;
  
      void deleteAltiCountrylocation(Integer id)
      throws NotFoundException;
  
}

