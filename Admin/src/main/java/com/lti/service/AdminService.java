package com.lti.service;

import com.lti.model.Admin;

public interface AdminService {

	public void addAdmin(Admin a);
	
	public Admin findAdmin(int id);
	
	public Admin updateAdmin(int id);
	
	public void removeAdmin(int id);
	
	public void findAll();

}