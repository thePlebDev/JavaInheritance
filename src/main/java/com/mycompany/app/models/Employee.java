package com.mycompany.app.models;

public class Employee extends Person{
	
	private float basicSalary;
	private String employeeNumber;
	
	Employee(String name,String employeeNumber,float basicSalary){
		super(name);
		this.employeeNumber = employeeNumber;
		this.basicSalary = basicSalary;
	}
	
	public String getEmployeeNumber() {return employeeNumber;}
	public float getBasicSalary() {return basicSalary;}
	
	//WE ARE RUNNING STUFF FROM HERE
	public static void main(String[] args) {
		Manager m = new Manager("Bob1","01234M",9000.0f,2000.0f);
		Secretery s = new Secretery("Bob2","98765s",2500.0f);
		
		
		System.out.print("The Manager" + m.getName() + "Employee number ->" + m.getEmployeeNumber());
		System.out.println("has a salary of" + m.getBasicSalary());
		
		System.out.println("Secretery has a salary of" + s.getBasicSalary()+ "Employee number ->" + s.getEmployeeNumber());
		
		System.out.print("The Manager " + m.getName());
		System.out.println("has a allowance of" + m.getAllowance());
		
		
	}
}
