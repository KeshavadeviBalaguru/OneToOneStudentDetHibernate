package com.java;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity  //create table Student
@Table(name="hibStudent")
public class Student {
	
	@Id //primary key
	@GeneratedValue 
	private int rollnum;
	
	@Column(name="SName",length=30)
	private String sname;
	@Column(name="Mark")
	private int mark;
	@OneToOne(cascade=CascadeType.ALL)
	 private Address addid;
	
	
	//generate setter and getter method 
		//generate toString
		
	
	public int getRollnum() {
		return rollnum;
	}
	
	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	
	public Address getAddid() {
		return addid;
	}

	public void setAddid(Address addid) {
		this.addid = addid;
	}

	@Override
	public String toString() {
		return "Student [rollnum=" + rollnum + ", sname=" + sname + ", mark=" + mark + ", addid=" + addid + "]";
	}
	


	
	
}
