package com.example.aopdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.example.aopdemo.data.*.*(..))")
	public void dataLayerExecution() {
		
	}
	
	@Pointcut("execution(* com.example.aopdemo.business.*.*(..))")
	public void businessLayerExecution() {
		
	}  
	 

} 


  