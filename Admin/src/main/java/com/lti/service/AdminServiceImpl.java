package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Admin;
import com.lti.repository.AdminRepository;

@Service("aservice")
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository repository;
	
	@Transactional
	public void addAdmin(Admin a) {
		repository.addAdmin(a);
	}
	
	public Admin findAdmin(int id)
	{
		return repository.findAdmin(id);
	}
	
	@Transactional
	public Admin updateAdmin(int id)
	{
		return repository.updateAdmin(id);
	}
	
	@Transactional
	public void removeAdmin(int id)
	{
		repository.removeAdmin(id);
	}
	
	@Transactional
	public void findAll()
	{
		repository.findAll();
	}
	
}
