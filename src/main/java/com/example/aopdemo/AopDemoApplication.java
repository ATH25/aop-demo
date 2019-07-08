package com.example.aopdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.aopdemo.business.Business1;
import com.example.aopdemo.business.Business2;

@SpringBootApplication
public class AopDemoApplication implements CommandLineRunner{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Business1 business1;
	
	@Autowired
	private Business2 business2;
	

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
		
		System.out.println("********* AopDemoApplication *********");
	}

	@Override
	public void run(String... args) throws Exception {  
		// TODO Auto-generated method stub
		logger.info("---------------------------");
		logger.info(business1.calculateSomething() );
		logger.info(business2.calculateSomething() );
	}

}
