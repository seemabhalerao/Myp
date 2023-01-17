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


import com.java.model.Teacher;
import com.java.repository.TeacherRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TeacherController {
	
	@Autowired
	public TeacherRepository trepo;
	
	@PostMapping("/saveteacher")
	@ResponseBody
	public void addTeacher(@RequestBody Teacher t)
	{
		trepo.save(t);
	
	}
	
	

	@GetMapping("/showTeacher")
	@ResponseBody
	public List<Teacher> getdata()
	{
		List<Teacher> l1=trepo.findAll();

				
		
		return l1 ;
		
	}
	
	@DeleteMapping("/deleteteacher/{teacher_id}")
	@ResponseBody
	public void deleteTeacher(@PathVariable("teacher_id") int teacher_id) {
		trepo.deleteById(teacher_id);
	}
	
	
	@PutMapping("/updateteacher/{teacher_id}")
	@ResponseBody
	public Teacher updateTeacher(@PathVariable("teacher_id") int teacher_id,@RequestBody Teacher teacher){

		Teacher tech=trepo.findById(teacher_id).get();	
		tech.setTeacher_name(teacher.getTeacher_name());
		tech.setTeacher_phone_no(teacher.getTeacher_phone_no());
		tech.setTeacher_qualification(teacher.getTeacher_qualification());
		tech.setTeacher_batch(teacher.getTeacher_batch());
		tech.setTeacher_course(teacher.getTeacher_course());
		
		Teacher lt=trepo.save(tech);
		
		return lt;
	}
	

}
