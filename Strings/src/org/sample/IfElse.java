package org.sample;

public class IfElse {
	private void voter(int age) {
		if(age>=18) {
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("Not Eligible to Vote");
			}
		}
	public static void main(String[]args) {
		IfElse a= new IfElse();
		
		a.voter(25);
	}

}

