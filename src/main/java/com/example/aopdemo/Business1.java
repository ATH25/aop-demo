package com.example.aopdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {
	
	@Autowired
	private Dao1 dao1;
	private String retrievetSomething;
	public String calculateSomething() {
		
		retrievetSomething = dao1.retrievetSomething();
		//for now just return something. Ideally there should be some business logic
		return retrievetSomething;
		
	}
	
	
}
