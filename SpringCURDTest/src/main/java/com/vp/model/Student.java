package com.vp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_TB")
public class Student {

	@Id
	int sid;
	String fname;
	String lname;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sid, String fname, String lname) {
		super();
		this.sid = sid;
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
	
}
