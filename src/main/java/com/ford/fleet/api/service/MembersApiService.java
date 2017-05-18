package com.ford.fleet.api.service;

import com.ford.fleet.models.Members;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface MembersApiService {
  
      List<Members> findAllMembers()
      throws NotFoundException;
  
      Members updateMembers(Members members)
      throws NotFoundException;
  
      Members addMembers(Members members)
      throws NotFoundException;
  
      Members findByIdMembers(Integer id)
      throws NotFoundException;
  
      void deleteMembers(Integer id)
      throws NotFoundException;
  
}

