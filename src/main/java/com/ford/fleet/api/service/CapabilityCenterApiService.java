package com.ford.fleet.api.service;

import com.ford.fleet.models.CapabilityCenter;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface CapabilityCenterApiService {
  
      List<CapabilityCenter> findAllCapabilityCenter()
      throws NotFoundException;
  
      CapabilityCenter updateCapabilityCenter(CapabilityCenter capabilityCenter)
      throws NotFoundException;
  
      CapabilityCenter addCapabilityCenter(CapabilityCenter capabilityCenter)
      throws NotFoundException;
  
      CapabilityCenter findByIdCapabilityCenter(Integer id)
      throws NotFoundException;
  
      void deleteCapabilityCenter(Integer id)
      throws NotFoundException;
  
}

