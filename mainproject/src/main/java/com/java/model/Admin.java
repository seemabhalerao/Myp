package com.java.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int admin_id;
	private String admin_name;
	private String admin_email;
	private String admin_phone;
	private String admin_address;
	@Column(unique = true)
	private String username;
	private String admin_pass;
		
	
	
	public Admin(int admin_id, String admin_name, String admin_email, String admin_phone, String admin_pass,
			String admin_address, String username) {
		super();
		this.admin_id = admin_id;
		this.admin_name = admin_name;
		this.admin_email = admin_email;
		this.admin_phone = admin_phone;
		this.admin_pass = admin_pass;
		this.admin_address = admin_address;
		this.username = username;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_email() {
		return admin_email;
	}
	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}
	public String getAdmin_phone() {
		return admin_phone;
	}
	public void setAdmin_phone(String admin_phone) {
		this.admin_phone = admin_phone;
	}
	public String getAdmin_pass() {
		return admin_pass;
	}
	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
	public String getAdmin_address() {
		return admin_address;
	}
	public void setAdmin_address(String admin_address) {
		this.admin_address = admin_address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "admin [admin_id=" + admin_id + ", admin_name=" + admin_name + ", admin_email=" + admin_email
				+ ", admin_phone=" + admin_phone + ", admin_pass=" + admin_pass + ", admin_address=" + admin_address
				+ ", username=" + username + "]";
	} 
	
	

}
