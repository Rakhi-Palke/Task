package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> s1  = new HashSet<String>();
		
		s1.add("Mumbai");
		s1.add("Mumbai");
		s1.add("Pune");
		s1.add("Nanded");
		s1.add("Nagpur");
		s1.add("Nashik");
		s1.add(null);
		s1.add(null);
		
		System.out.println(s1);
		
		Iterator t1 = s1.iterator();
		
		while(t1.hasNext()) {
			System.out.println(t1.next());
		}
	}

}
