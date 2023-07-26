package com.example.springAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	private static Logger log = LoggerFactory.getLogger(LoggingAspect.class);

	@Pointcut("execution(* com.example.springAOP.ShoppingCart.checkout())")
	private void logPointCut() {
	}

	//	@Before("execution(* com.example.springAOP.ShoppingCart.checkout())")
	//  @Pointcut improves readability, by not repeating long definition of the point you need to cut in.
	@Before("logPointCut()")
	public void beforeLogger() {
		log.info("LoggingAspect :: Calling @Before");
	}
	
	// @After("execution(* com.example.springAOP.ShoppingCart.checkout())")
	//	@After("execution(* com.example.springAOP.*.checkout())")
	//  @Pointcut improves readability, by not repeating long definition of the point you need to cut in.
	@After("logPointCut()")
	public void afterLogger() {
		log.info("LoggingAspect :: Calling @After");
	}
	
	// @Around requires 'ProceedingJoinPoint' as a first parameter. For learning purpose, will not share in this demo.
	// It contains the code that has to be executed before and after when the method is matched with the pointcut
	// Good reads - https://www.geeksforgeeks.org/usage-of-before-after-around-afterreturning-and-afterthrowing-in-a-single-spring-aop-project/

}
