package org.sample;

public class Master {
	private void even(int num) {
		if(num % 2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}
	public static void main(String[]args) {
		Master a = new Master();
		a.even(18);
	}

}
