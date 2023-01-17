package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer>{

}
