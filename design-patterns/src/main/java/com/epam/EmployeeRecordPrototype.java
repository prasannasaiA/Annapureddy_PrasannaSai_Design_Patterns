package com.epam;

interface Prototype{
	
	Prototype getClone();
	
}

public class EmployeeRecordPrototype implements Prototype{
	
	private int id;
	private String name,designation;
	private double salary;
	
	public EmployeeRecordPrototype(int id,String name, String desig, double sal) {
		
		this.id = id;
		this.name = name;
		this.designation=desig;
		this.salary=sal;
		
	}
	
	public String showRecord() {
		
		return "Eid: "+id+" Name: "+name+" Designation: "+designation+" Salary: "+salary;
		
	}
	
	@Override
	public Prototype getClone() {
		
		return new EmployeeRecordPrototype(id,name,designation,salary);
		
	}
	
}