package org.sam;

public class BasicsCoding {
	private void empData(String name) {
		System.out.println("My Name is:"+name);
		this.empData(20);
	}
	private void empData(int age) {
		System.out.println("My Age is:"+age);
	}

	public static void main(String[]args) {
		BasicsCoding a= new BasicsCoding();
		a.empData("Dhiwa");
		a.empData(22);
		
	}
	
		
	}


