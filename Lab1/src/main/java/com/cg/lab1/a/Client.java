package com.cg.lab1.a;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
@SuppressWarnings("resource")
public static void main(String[] args) {
	
	
	ApplicationContext actx=new ClassPathXmlApplicationContext("springA.xml");
	Employee emp = actx.getBean("emp", Employee.class);
	
	System.out.println("Employee Details");
	System.out.println("-------------------------");
	System.out.println(emp);
}
}
