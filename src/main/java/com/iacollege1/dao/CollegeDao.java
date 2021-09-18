package com.iacollege1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iacollege1.entities.College;

public interface CollegeDao extends JpaRepository <College, Long>{

}
