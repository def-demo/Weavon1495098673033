package com.ford.fleet.api.service;

import com.ford.fleet.models.AssignmentStatus;


import com.ford.fleet.exception.NotFoundException;
import java.util.List;

public interface AssignmentStatusApiService {
  
      List<AssignmentStatus> findAllAssignmentStatus()
      throws NotFoundException;
  
      AssignmentStatus updateAssignmentStatus(AssignmentStatus assignmentStatus)
      throws NotFoundException;
  
      AssignmentStatus addAssignmentStatus(AssignmentStatus assignmentStatus)
      throws NotFoundException;
  
      AssignmentStatus findByIdAssignmentStatus(Integer id)
      throws NotFoundException;
  
      void deleteAssignmentStatus(Integer id)
      throws NotFoundException;
  
}

