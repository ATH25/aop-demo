package com.example.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration 
@Aspect
@Configuration
public class MethodExecutionCalculationAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	/* using @Around */
	@Around(value = "execution(* com.example.aopdemo.business.*.*(..))" )
	public void around(ProceedingJoinPoint joinPoint) throws Throwable { //the method name doesn't matter. 
		long startTime = System.currentTimeMillis();
		joinPoint.proceed();
		long timeTaken = startTime - System.currentTimeMillis();
		
		logger.info(" ++++++++ Time taken by: {} is {} ", joinPoint, timeTaken);    
	}
	
	
	
	

}
