package com.fyu.dto;

public class Employee extends Person {
	protected double salary;
	private int workingYears;
	private String departmentName;
	private long employeeId;
	static long number = 0;
	public static long id = 1;

	public Employee(String name, int age, String gender, String ssn, String nationality, String address,
			String social_status, String mail, String phone, double salary, int workingYears, String departmentName) {
		super(name, age, gender, ssn, nationality, address, social_status, mail, phone);
		this.salary = salary;
		this.workingYears = workingYears;
		this.departmentName = departmentName;
		this.employeeId = id;
		number++;
		id++;
	}

	public long getEmployeeId() {
		return employeeId;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setWorkingYears(int workingYears) {
		this.workingYears = workingYears;
	}

	public int getWorkingYears() {
		return workingYears;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void raiseSalary() {
		this.salary += this.salary * 0.03;
	}

}
