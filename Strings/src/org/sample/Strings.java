package org.sample;

public class Strings {
	public static void main(String[]args) {
		String a = "Dhiwakar";
		
		char charAt = a.charAt(2);
		System.out.println(charAt);
		
		int indexOf = a.indexOf(a);
		System.out.println(indexOf);
		
		int lastIndexOf = a.lastIndexOf(a);
		System.out.println(lastIndexOf);
		
		 int length = a.length();
		 System.out.println(length);
		 
		 boolean empty = a.isEmpty();
		 System.out.println(empty);
		 
		 boolean contains = a.contains(a);
		 System.out.println(contains);
		 
		 String b = "Dhiwakar Raman";
		 
		 String trim = b.trim();
		 System.out.println(trim);
		 
		 boolean startsWith = a.startsWith(a);
		 System.out.println(startsWith);
		 
		 boolean endsWith = a.endsWith(a);
		 System.out.println(endsWith);
		 
		 String upperCase = b.toUpperCase();
		 System.out.println(upperCase);
		 
		 String lowerCase = b.toLowerCase();
		 System.out.println(lowerCase);
		 
		 boolean equals = a.equals(b);
		 System.out.println(equals);
		 
		 boolean equalsIgnoreCase = a.equalsIgnoreCase(b);
		 System.out.println(equalsIgnoreCase);
		 
		 String replace = a.replace("kar","a");
		 System.out.println(replace);
		 
		 String replaceAll = a.replaceAll(a,b);
		 System.out.println(replaceAll);
		 
		 String substring = a.substring(2);
		 System.out.println(substring);
		 
		 String substring2 = a.substring(2,7);
		 System.out.println(substring2);
		 
		 int compareTo = a.compareTo(b);
		 System.out.println(compareTo);
		
		 
		
	}

}
