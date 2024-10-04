package org.sample;

import java.util.*;
import java.util.Collection;
import java.util.Map.Entry;

public class Map {
	public static void main(String[] args) {

		   
	    // HashMap--random order  

	Map<String,Integer> m = new HashMap();

	m.put("kamaraj",10);

	m.put("bhuvi",20);

	m.put("dhiwa",30);

	m.put("java",40);

	m.put("csk",5);


	System.out.println(m);


	System.out.println("-------------------------");

	   

	    // LinkedHashMap--insertion order

	 Map<String,Integer> m1 = new LinkedHashMap();

	 m1.put("kamaraj",10);

	 m1.put("bhuvi",20);

	 m1.put("dhiwa",30);

	 m1.put("java",40);

	 m1.put("csk",50);

	 
	 System.out.println(m1);

	 
	 System.out.println("--------------------------");

	     

	    // TreeMap--ascending order

	 Map<String,Integer> m2 = new TreeMap();

	 m2.put("kamaraj",10);

	 m2.put("bhuvi",20);

	 m2.put("dhiwa",30);

	 m2.put("java",40);

	 m2.put("csk",50);

	   
	 System.out.println(m2);

	       

	 System.out.println("---------------------------");

	 

	        //Hashtable--random order

	       Map<String,Integer> m3 = new Hashtable();

	       m3.put("kamaraj",10);

	       m3.put("bhuvi",20);

	       m3.put("dhiwa",30);

	       m3.put("java",40);

	       m3.put("csk",50);

	 
	       System.out.println(m3);

	       
	       System.out.println("----------------------------");



	//Methods of Map

	int size = m1.size();

	System.out.println(size);


	boolean containsKey = m1.containsKey("kamaraj");

	System.out.println(containsKey);


	boolean containsValue = m1.containsValue(0);

	System.out.println(containsValue);


	m1.remove("java");

	System.out.println(m1);


	Set<String> keySet = m1.keySet();

	System.out.println(keySet);


	Collection<Integer> values = m1.values();

	System.out.println(values);


	System.out.println("-----------------------------");


	Set<Entry<String, Integer>> entrySet = m.entrySet();
	for(Entry<String,Integer> e:entrySet) {

	System.out.println(e);

	System.out.println(e.getKey());

	System.out.println(e.getValue());

	}



	}

	}

}

		   
	    