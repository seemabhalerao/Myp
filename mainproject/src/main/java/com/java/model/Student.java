package com.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	private String student_name;
	private String student_address;
	private String student_gender;
	private String student_phone_no;
	
	private String student_batch;
	private String student_course;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int student_id, String student_name, String student_address, String student_gender,
			String student_phone_no, String student_batch, String student_course) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_address = student_address;
		this.student_gender = student_gender;
		this.student_phone_no = student_phone_no;
		this.student_batch = student_batch;
		this.student_course = student_course;
	}


	public int getStudent_id() {
		return student_id;
	}


	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}


	public String getStudent_name() {
		return student_name;
	}


	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}


	public String getStudent_address() {
		return student_address;
	}


	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}


	public String getStudent_gender() {
		return student_gender;
	}


	public void setStudent_gender(String student_gender) {
		this.student_gender = student_gender;
	}


	public String getStudent_phone_no() {
		return student_phone_no;
	}


	public void setStudent_phone_no(String student_phone_no) {
		this.student_phone_no = student_phone_no;
	}


	public String getStudent_batch() {
		return student_batch;
	}


	public void setStudent_batch(String student_batch) {
		this.student_batch = student_batch;
	}


	public String getStudent_course() {
		return student_course;
	}


	public void setStudent_course(String student_course) {
		this.student_course = student_course;
	}


	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_address="
				+ student_address + ", student_gender=" + student_gender + ", student_phone_no=" + student_phone_no
				+ ", student_batch=" + student_batch + ", student_course=" + student_course + "]";
	}

	
	
	
	
	
}
