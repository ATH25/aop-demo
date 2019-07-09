package com.example.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

// AOP
// Configuration 
@Aspect
@Configuration
public class UseAccessAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/* what kind of method calls I would want to be intercepted */
	/*----------------------------------------------------------
	 * if you want to intercept all method calls in a package, the format is
	 * execution(* PACKAGE.*.*(..))
	 * This means, intercept any class in the package, any method with any number of arguments. 
	 */
	
	@Before("execution(* com.example.aopdemo.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		/* advice */
		logger.info("******* before *******");
		logger.info(" Check for user access ");
		logger.info(" --- Allowed execution for {}", joinPoint);
	}
	
	
	/* The below annotation says that intercept any methods with any number of arguments in the package 
	 * execution(* com.example.aopdemo
	 *  */
//	@Before("execution(* com.example.aopdemo..*.*(..))")
//	public void before(JoinPoint joinPoint) {
//		logger.info(" Check for user access ");
//		logger.info(" --- Allowed execution for {}", joinPoint);
//	}
	

}
