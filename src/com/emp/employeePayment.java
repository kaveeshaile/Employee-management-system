package com.emp;

public class employeePayment {
	
	private String id;
	private String name;
	private String department;
	private  float basicSalary;
	private  float deduction;
	private  float overTime;
	
	
	public employeePayment(String id, String name, String department, float basicSalary,  float deduction,  float overTime ) {
		
		this.id = id;
		this.name = name;
		this.department = department;
		this.basicSalary = basicSalary;
		this.deduction = deduction;
		this.overTime = overTime;
		
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public  float getBasicSalary() {
		return basicSalary;
	}

	public  float getDeduction() {
		return deduction;
	}

	public  float getOverTime() {
		return overTime;
	}
	
	
		

}
