package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.model.Admin;

@Repository("arepository")
public class AdminRepositoryImpl implements AdminRepository {
	
	
	@PersistenceContext
	EntityManager em;
	
	public void addAdmin(Admin a) {
		em.persist(a);
	}
	
	public Admin findAdmin(int id)
	{
		Admin a=em.find(Admin.class,id);
		return a;
	}
	
	public Admin updateAdmin(int id)
	{
		Admin a=em.find(Admin.class,id);
		em.merge(a);
		a.setUsername("Divya");
		a.setPassword("Bhosle");
		return a;
	}

	public void removeAdmin(int id)
	{
		Admin a=em.find(Admin.class,id);
		
		em.merge(a);
		em.remove(a);
	}
	
	public void findAll()
	{
		String q="Select a from Admin a";
		javax.persistence.TypedQuery<Admin> query=em.createQuery(q,Admin.class);
		List<Admin> l=query.getResultList();
		
		for(Admin a:l)
		{
			System.out.println("\n\n----------"+a);
		}
	}
	
}
