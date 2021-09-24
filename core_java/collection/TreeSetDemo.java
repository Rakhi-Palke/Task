package com.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> s1 = new TreeSet<String>();
		
		s1.add("Mumbai");
		s1.add("Mumbai");
		s1.add("Banaras");
		s1.add("Delhi");
		s1.add("Pune");
		s1.add("Nanded");
		s1.add("Nagpur");
		s1.add("Nashik");
		
		
         System.out.println(s1);
		
		Iterator t1 = s1.iterator();
		
		while(t1.hasNext()) {
			System.out.println(t1.next());
		}
		
		TreeSet<Integer> s2 = new TreeSet<Integer>();
		s2.add(105);
		s2.add(103);
		s2.add(109);
		s2.add(106);
		s2.add(102);
		s2.add(108);
		s2.add(104);
		s2.add(107);
		s2.add(110);
		s2.add(101);
		
  Iterator t2 = s2.iterator();
		
		while(t2.hasNext()) {
			System.out.println(t2.next());
		}
		
	}

}
