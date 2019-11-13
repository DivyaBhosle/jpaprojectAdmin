package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {

	@Id 
	int admin_id;
	String username;
	String password;
	String email;
	String department;
	
	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Admin(int admin_id, String username, String password, String email, String department) {
		super();
		this.admin_id = admin_id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", department=" + department + "]";
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}

}
