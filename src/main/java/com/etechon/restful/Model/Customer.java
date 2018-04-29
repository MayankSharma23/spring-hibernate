package com.etechon.restful.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private Long Id;
	private String emailId;
	private String phone;
	private String username;
	private String pass;
	
	public Customer() {	
	}
	
	public Customer(Long id, String emailId, String phone, String username, String pass) {
		super();
		Id = id;
		this.emailId = emailId;
		this.phone = phone;
		this.username = username;
		this.pass = pass;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
	

}
