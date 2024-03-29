package com.example.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration 
@Aspect
@Configuration
public class AfterAopAspect { 
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	
	@AfterReturning(value = "com.example.aopdemo.aspect.CommonJoinPointConfig.businessLayerExecution()",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("======== afterReturning ========");
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
	@AfterThrowing(value = "com.example.aopdemo.aspect.CommonJoinPointConfig.businessLayerExecution()", 
			throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint, Object exception) {
		logger.info("############ afterThrowing ############");
		logger.info("{} thrown exception {}", joinPoint, exception);
	}
	 
	@After(value = "com.example.aopdemo.aspect.CommonJoinPointConfig.businessLayerExecution()")
	public void after(JoinPoint joinPoint) {
		logger.info("$$$$$$$$$ after $$$$$$$$$");
		logger.info(" after the execution of {}", joinPoint);
	}
	
	  

}
