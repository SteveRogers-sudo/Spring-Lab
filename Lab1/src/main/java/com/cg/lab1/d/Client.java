package com.cg.lab1.d;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
public static void main(String[] args) {
	ApplicationContext actx =new ClassPathXmlApplicationContext("springD.xml");
	EmployeeDAO sbu= actx.getBean("emp",EmployeeDAO.class);
	System.out.println("Enter Employee Id : ");
	
	Scanner sc=new Scanner(System.in);
	int empId=sc.nextInt();
	
	EmployeeService empService=new EmployeeServiceImpl();
	Employee emp=empService.getDetails(empId);
	
	if(emp==null){
		System.out.println("No Employee Exist");
	}
	else{
		System.out.println("Emplyee info:");
		System.out.println("Employee Id: "+emp.getEmployeeId());
		System.out.println("Employee Name: "+emp.getEmployeeName());
		System.out.println("Employee Salary: "+emp.getSalary());
	}
}
}
