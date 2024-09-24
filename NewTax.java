package org.sam;

public class NewTax extends OldTax {
	public void taxLimit(int tax) {
		System.out.println("New Tax is"+tax);
		super.taxLimit(tax);
	}
	public static void main(String[]args) {
		NewTax a= new NewTax();
		a.taxLimit(500000);
	}

}