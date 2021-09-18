package com.iacollege1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iacollege1.entities.Users;

public interface UserDao extends JpaRepository <Users, Long> {

}
