package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from the spring container 
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		// get the business method 
		theAccountDAO.addAccount();
		
		
		System.out.println("\n let's call it again \n");
		
		
		theAccountDAO.addAccount();
		
		//close the context
		
		context.close();

	}

}
