package org.sample;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
public static void main(String[] args) {
	

   //HashSet Class
	HashSet a = new HashSet();
    a.add(10);
    a.add(70);
    a.add(50);
    a.add(null);
    a.add(80);
    a.add(05);
    a.add(75);
    
    System.out.println(a);
     for (Object g : a) {
    	 System.out.println(g);
     }
     
     System.out.println("======================");
 

 
    //LinkedHashSet Class
    
    LinkedHashSet b = new LinkedHashSet();
    b.add(10);
    b.add(70);
    b.add(50);
    b.add(null);
    b.add(80);
    b.add(05);
    b.add(75);
    
    System.out.println(b);
    
    System.out.println("===========================");

     //TreeSet Class
    
    TreeSet c = new TreeSet();
    c.add(10);
    c.add(70);
    c.add(50);
    c.add(30);
    c.add(80);
    c.add(05);
    c.add(75);
    
    System.out.println(c);
} 

}
