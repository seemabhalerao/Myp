package com.java.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;




@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teacher_id;
	private String teacher_name;
	private String teacher_qualification;
	private String teacher_phone_no;
	
	private String teacher_batch;
	private String teacher_course;
	

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Teacher(int teacher_id, String teacher_name, String teacher_qualification, String teacher_phone_no,
			String teacher_batch, String teacher_course) {
		super();
		this.teacher_id = teacher_id;
		this.teacher_name = teacher_name;
		this.teacher_qualification = teacher_qualification;
		this.teacher_phone_no = teacher_phone_no;
		this.teacher_batch = teacher_batch;
		this.teacher_course = teacher_course;
	}


	public int getTeacher_id() {
		return teacher_id;
	}


	public void setTeacher_id(int teacher_id) {
		this.teacher_id = teacher_id;
	}


	public String getTeacher_name() {
		return teacher_name;
	}


	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}


	public String getTeacher_qualification() {
		return teacher_qualification;
	}


	public void setTeacher_qualification(String teacher_qualification) {
		this.teacher_qualification = teacher_qualification;
	}


	public String getTeacher_phone_no() {
		return teacher_phone_no;
	}


	public void setTeacher_phone_no(String teacher_phone_no) {
		this.teacher_phone_no = teacher_phone_no;
	}


	public String getTeacher_batch() {
		return teacher_batch;
	}


	public void setTeacher_batch(String teacher_batch) {
		this.teacher_batch = teacher_batch;
	}


	public String getTeacher_course() {
		return teacher_course;
	}


	public void setTeacher_course(String teacher_course) {
		this.teacher_course = teacher_course;
	}


	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_qualification="
				+ teacher_qualification + ", teacher_phone_no=" + teacher_phone_no + ", teacher_batch=" + teacher_batch
				+ ", teacher_course=" + teacher_course + "]";
	}
	
	
}
