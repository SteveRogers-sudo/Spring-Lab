package com.cg.lab1.b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
public static void main(String[] args) {
	ApplicationContext actx=new ClassPathXmlApplicationContext("springB.xml");
	Employee emp = actx.getBean("emp",Employee.class);
	
	System.out.println("Employee Details");
	System.out.println("-------------------------");
	System.out.println(emp);
	
	
}
}
