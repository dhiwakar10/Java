package org.sam; 

public class PartialAbsstract extends FullyAbstract {
	
	public static void main(String[] args) {
		
		PartialAbsstract a= new PartialAbsstract();
		a.empAge();
		a.empId(22);
		a.empName();
		
	}
    public void empAge() {
    	System.out.println("emp age is 25");
    }
}
