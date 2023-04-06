package com.techpalle.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="id")
	private int eno;
	private String ename;
	private String edesgination;
	private int esal;
	
	
	
	public Employee(int eno, String ename, String edesgination, int esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.edesgination = edesgination;
		this.esal = esal;
	}
	
	
	public Employee() {
		super();
	}


	public Employee(String ename, String edesgination, int esal) {
		super();
		this.ename = ename;
		this.edesgination = edesgination;
		this.esal = esal;
	}


	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesgination() {
		return edesgination;
	}
	public void setEdesgination(String edesgination) {
		this.edesgination = edesgination;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}

	
	

	
	
	

	
	

	
	
	
	
	
	
	
}
