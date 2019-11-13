package com.lti.repository;

import java.util.List;

import com.lti.model.Admin;

public interface AdminRepository {

	void addAdmin(Admin a);
	
	public Admin findAdmin(int id);
	
	public Admin updateAdmin(int id);
	
	public void removeAdmin(int id);
	
	public void findAll();

}