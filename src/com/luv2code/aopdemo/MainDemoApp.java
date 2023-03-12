package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		// get the bean from the spring container 
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		// get the business method 
		theAccountDAO. addAccount(new Account(), true);
		
		
		System.out.println("\n");
		
		theAccountDAO.updateAccount();
		
		
		System.out.println("\n");
		// call the membershipDAo method 
		
		theMembershipDAO.addSillyMember();
		
		
		context.close();

	}

}
