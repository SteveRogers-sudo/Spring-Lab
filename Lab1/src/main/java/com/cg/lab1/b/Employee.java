package com.cg.lab1.b;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private SBU businessUnit;
	private int age;
	
	@Override
	public String toString() {
		return "Employee [ empAge=" + age +", empId =" + employeeId + ", empName=" + employeeName + ", empSalary=" + salary
				+ "}\nsbu details =" + businessUnit + "]";
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public SBU getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(SBU businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
