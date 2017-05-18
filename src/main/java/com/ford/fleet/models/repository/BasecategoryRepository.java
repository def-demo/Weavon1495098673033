package com.ford.fleet.models.repository;

import com.ford.fleet.models.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface BasecategoryRepository extends JpaRepository<Basecategory, Integer>{

}



