package org.sample;

import java.util.*;






public class List {
public static void main(String[] args) {
	
	
	ArrayList a = new ArrayList();
	a.add(10);
	a.add("Dhiwa");
	a.add(true);
	a.add('M');
	a.add(null);
	a.add(10.10);
	a.add(10);
	
     int size = a.size();
	System.out.println(size);
	
	 boolean contains = a.contains(a);
	System.out.println(contains);
	

	 int indexOf = a.indexOf(2);
	System.out.println(indexOf);
	
	 int lastIndexOf = a.lastIndexOf(6);
	System.out.println(lastIndexOf);
	
	Object remove = a.remove(3);
	System.out.println(remove);
	
	Object get = (Object) a.get(1);
	System.out.println(get);
           
	
	
	

	
	System.out.println(a);
	System.out.println("=====================");
	
	for(int i=0;i<a.size();i++) {
		System.out.println(a.get(i));
	
	}
}


}
	
	
	


