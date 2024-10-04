package org.basic;

public class Palindrom {
	public static void main(String[] args) {
		String a = "LEVEL";
		String b ="";
		
		for (int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
			
			b+=a.charAt(i);
		}
		System.out.println(a);
		
		if(a.equals(b)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Not Palindrom");
		}
	}

}
