package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.ashokit.beans.Car;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ashok","com.ashokit"})// it's overriding default ComponentScaning 
public class Application {
//change priority task 12pm no 102
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		Car car = context.getBean(Car.class);
		car.getClass();
		System.out.println(car.getClass());
	}
	
	public void displayMessage()
	{
		//making change 8am task
		System.out.println("Stash in not complate task");
	}
}
