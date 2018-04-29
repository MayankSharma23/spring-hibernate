package com.etechon.restful.Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String name;
	private String designation;
	private String emailid;
	
	public Employee() {
		
	}
	
	public Employee(Long id, String name, String designation, String emailid) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.emailid = emailid;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	

}
