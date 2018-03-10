package com.fund.BankApp.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BankLoggingAspect {
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Pointcut("execution(* com.fund.BankApp.controllers.*.*(..))")
	private void forControllersPackage() {}

	@Pointcut("execution(* com.fund.BankApp.dao.*.*(..))")
	private void forDAOPackage() {}

	@Pointcut("execution(* com.fund.BankApp.services.*.*(..))")
	private void forServicesPackage() {}
	
	@Pointcut("forControllersPackage()||forDAOPackage()||forServicesPackage()")
	private void forApplication() {}
	
	@Before("forApplication()")
	public void before(JoinPoint joinPoint) {
		
		String methodName = joinPoint.getSignature().toShortString();
		 logger.info("Information: in @Before Advice: Calling the method: "+methodName);
	}
	
	@AfterReturning(pointcut = "forApplication()",returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		
		String methodName = joinPoint.getSignature().toShortString();
		
		 logger.info("Information: in @AfterReturning : from method: "+methodName);
		 logger.info("Info: Date returned by Method"+result);
	}
}
