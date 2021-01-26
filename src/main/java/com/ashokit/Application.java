package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ashok","com.ashokit"})// it's overriding default ComponentScaning 
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	public void displayMessage()
	{
		//making change 8am task
		System.out.println("Stash in not complate task");
	}
}
