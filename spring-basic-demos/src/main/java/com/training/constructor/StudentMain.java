package com.training.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("com.training.constructor");
		
		Student student= context.getBean(Student.class);
		System.out.println(student);
		
	}

}
