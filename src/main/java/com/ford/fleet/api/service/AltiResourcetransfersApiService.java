package com.ford.fleet.api.service;

import com.ford.fleet.models.AltiResourcetransfers;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface AltiResourcetransfersApiService {
  
      List<AltiResourcetransfers> findAllAltiResourcetransfers()
      throws NotFoundException;
  
      AltiResourcetransfers updateAltiResourcetransfers(AltiResourcetransfers altiResourcetransfers)
      throws NotFoundException;
  
      AltiResourcetransfers addAltiResourcetransfers(AltiResourcetransfers altiResourcetransfers)
      throws NotFoundException;
  
      AltiResourcetransfers findByIdAltiResourcetransfers(Long id)
      throws NotFoundException;
  
      void deleteAltiResourcetransfers(Long id)
      throws NotFoundException;
  
}

