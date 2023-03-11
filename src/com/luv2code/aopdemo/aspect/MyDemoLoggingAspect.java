package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {
	
	
	//public void beforeAdvice() {
	@Before("execution(* add*())")
	public void beforeAddAccountAdvice() {
		
		System.out.println("\n =======> executing @Before advice on method");
		
	}

	
}
