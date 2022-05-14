package com.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hibAddress")
public class Address {
     @Id
     @GeneratedValue
     private int addid;
     private String Street;
     @Column(name="Stpin")
	private int Pincode;
     @Column(name="Ststate")
	private String State;
     @Column(name="Stcountry")
     private String Country;
	public int getAddid() {
		return addid;
	}
	public void setAddid(int addid) {
		this.addid = addid;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", Street=" + Street + ", Pincode=" + Pincode + ", State=" + State
				+ ", Country=" + Country + "]";
	}
	
	
}
