package com.training.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		/*
		 * Employee employee=new Employee(); employee.setName("Pramod");
		 * employee.setEmployeeId(302038); employee.setSalary(20000);
		 * System.out.println("name is "+employee.getName());
		 * System.out.println("Id is "+employee.getEmployeeId());
		 * System.out.println("Salary is "+employee.getSalary());
		 */
		
	        ApplicationContext conntext=new AnnotationConfigApplicationContext("com.training");
//	      
//	        Employee emp=(Employee) conntext.getBean("employee");
//	        System.out.println(emp);
	        
	        Employee employee=conntext.getBean(Employee.class);
	        System.out.println(employee);
	        
//	        Employee employee1=conntext.getBean(Employee.class,"employee");
//	        System.out.println(employee1);
//	        System.out.println();
//	        
//	        String [] beans=conntext.getBeanDefinitionNames();
//	        for (String bean : beans) {
//				System.out.println(bean);
//				
//			}
//	        System.out.println();
//	        System.out.println("Other way");
//	        
//	        Stream.of(conntext.getBeanDefinitionNames()).forEach(System.out::println);
	        
//	        Adress adress=(Adress) conntext.getBean("adress");
//	        System.out.println(adress);
//	        
//	        
//	        Adress adress1=(Adress) conntext.getBean(Adress.class,"adress");
//	        System.out.println(adress1);
//	        
//	        Adress adress2=(Adress) conntext.getBean(Adress.class);
//	        System.out.println(adress2);
	}

}
