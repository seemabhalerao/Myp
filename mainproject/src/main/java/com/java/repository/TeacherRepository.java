package com.java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.model.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Integer>{

}
