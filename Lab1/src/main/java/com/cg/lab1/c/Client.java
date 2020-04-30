package com.cg.lab1.c;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
public static void main(String[] args) {
	
	ApplicationContext actx=new ClassPathXmlApplicationContext("springC.xml");
	SBU sbu=actx.getBean("sbu",SBU.class);
	
	System.out.println("SBU Details");
	System.out.println("----------------------------");
	System.out.println("sbuCode="+sbu.getSbuCode()+", sbuHead="+sbu.getSbuHead()+", sbuName="+sbu.getSbuName());
	System.out.println("Employee Details:----------------");
	System.out.print("[");
	
	List<Employee> empList= sbu.getEmplist();
	
	for(Employee data:empList){
		System.out.print("Employee [");
		System.out.print("empId="+data.getEmployeeId()+", ");
		System.out.print("empName="+data.getEmployeeName()+", ");
		System.out.print("empSalary="+data.getSalary()+"]  ");
		
	}
}
}
