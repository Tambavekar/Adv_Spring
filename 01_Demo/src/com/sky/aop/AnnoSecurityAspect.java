package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnoSecurityAspect {

//	@Before("execution(* com.sky.aop.ApplicationService.*(..))")
//	public void VerifyApplicationFrom() {
//		System.out.println("Ina anno before call");
//	}
//
//	@After("execution(* com.sky.aop.ApplicationService.*(..))")
//	public void processResult() {
//		System.out.println("processResult");
//	}
	
	@Before("@annotation(com.sky.aop.Log)")
	public void processloger()
	{
		System.out.println("Processloger");
	}
	
}
