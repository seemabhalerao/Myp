package com.java.controller;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.java.model.Student;
import com.java.repository.StudentRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

	@Autowired
	public StudentRepository srepo;
	
	@PostMapping("/savestudent")
	@ResponseBody
	public void addStudent(@RequestBody Student s)
	{
		srepo.save(s);
	
	}
	
	

	@GetMapping("/showstudent")
	@ResponseBody
	public List<Student> getdata()
	{
		List<Student> l1=srepo.findAll();

				
		
		return l1 ;
		
	}
	
	@DeleteMapping("/deletestudent/{student_id}")
	@ResponseBody
	public void deleteStudent(@PathVariable("student_id") int student_id) {
		srepo.deleteById(student_id);
	}
	
	
	@PutMapping("/updatestudent/{student_id}")
	@ResponseBody
	public Student updateStudent(@PathVariable("student_id") int student_id,@RequestBody Student student){

		Student stud=srepo.findById(student_id).get();
		stud.setStudent_name(student.getStudent_name());
		stud.setStudent_phone_no(student.getStudent_phone_no());
		stud.setStudent_address(student.getStudent_address());
		stud.setStudent_batch(student.getStudent_batch());
		stud.setStudent_course(student.getStudent_course());
		
		Student lt=srepo.save(stud);
		
		return lt;
	}
	

}
