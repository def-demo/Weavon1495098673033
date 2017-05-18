package com.ford.fleet.models.repository;

import com.ford.fleet.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface AltiAdminRepository extends JpaRepository<AltiAdmin, Integer>{

}



