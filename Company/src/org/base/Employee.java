package org.base;

public class Employee {
	private void empId() {
		System.out.println("emp id is 099876");
	}
	private void empName() {
		System.out.println("emp name is Ravi");
	}
	public static void main(String[]args) {
		
		Company a= new Company();
		a.compId();
		a.compName();
		
		Employee b= new Employee();
		b.empId();
		b.empName();
	}
}
