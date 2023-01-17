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

import com.java.model.Admin;
import com.java.repository.AdminRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {




	@Autowired
	public AdminRepository arepo;
	
	@PostMapping("/saveadmin")
	@ResponseBody
	public void addAdmin(@RequestBody Admin a)
	{
		arepo.save(a);
	
	}
	
	

	@GetMapping("/showadmin")
	@ResponseBody
	public List<Admin> getdata()
	{
		List<Admin> l1=arepo.findAll();

				
		
		return l1 ;
		
	}
	
	@DeleteMapping("/deleteadmin/{admin_id}")
	@ResponseBody
	public void deleteAdmin(@PathVariable("admin_id") int admin_id) {
		arepo.deleteById(admin_id);
	}
	
	
	@PutMapping("/updateadmin/{admin_id}")
	@ResponseBody
	public Admin updateAdmin(@PathVariable("admin_id") int admin_id,@RequestBody Admin admin){

		Admin admi=arepo.findById(admin_id).get();
		admi.setAdmin_name(admin.getAdmin_name());
		admi.setAdmin_phone(admin.getAdmin_phone());
		admi.setAdmin_address(admin.getAdmin_address());
		admi.setAdmin_email(admin.getAdmin_email());
		admi.setAdmin_pass(admin.getAdmin_pass());
		admi.setUsername(admin.getUsername());
		
		Admin at=arepo.save(admi);
		
		return at;
	}
	

}
