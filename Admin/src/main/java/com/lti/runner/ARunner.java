package com.lti.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.model.Admin;

import com.lti.service.AdminService;

public class ARunner {

	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");;
		
		AdminService service;
		service=ctx.getBean("aservice",AdminService.class);
		
		Admin a=new Admin(8,"u123","u*12","utkarsha@gmail.com","DatabaseOperations");
		
		service.addAdmin(a);
		
		System.out.println("admin added");
		
		Admin a1=service.findAdmin(5);
		System.out.println(a1);
		
		
		System.out.println("\n\n---------Update-------------");
		Admin a3= service.updateAdmin(2);
		System.out.println("Fetch result:"+a3);
		
		service.removeAdmin(4);
		System.out.println("admin removed");
		
		System.out.println("------findall----");
		service.findAll();
		
		
	}

}
