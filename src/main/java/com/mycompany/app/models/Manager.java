package com.mycompany.app.models;

public class Manager extends Employee{
	private float allowance;
	
	Manager(String name, String employeeNumber, float basicSalary, float allowanceAmt){
		super(name,employeeNumber,basicSalary);
		
		this.allowance = allowanceAmt;
	}
	
	public float getAllowance() {
		return allowance;
	}
}
