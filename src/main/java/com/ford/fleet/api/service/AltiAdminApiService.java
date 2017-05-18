package com.ford.fleet.api.service;

import com.ford.fleet.models.AltiAdmin;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface AltiAdminApiService {
  
      List<AltiAdmin> findAllAltiAdmin()
      throws NotFoundException;
  
      AltiAdmin updateAltiAdmin(AltiAdmin altiAdmin)
      throws NotFoundException;
  
      AltiAdmin addAltiAdmin(AltiAdmin altiAdmin)
      throws NotFoundException;
  
      AltiAdmin findByIdAltiAdmin(Integer id)
      throws NotFoundException;
  
      void deleteAltiAdmin(Integer id)
      throws NotFoundException;
  
}

