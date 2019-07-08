package com.example.aopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;
	private String retrievetSomething;
	public String calculateSomething() {
		
		retrievetSomething = dao2.retrievetSomething();
		//for now just return something. Ideally there should be some business logic
		return retrievetSomething;
		
	}
	
	
}
