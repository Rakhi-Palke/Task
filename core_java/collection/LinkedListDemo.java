package com.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<String>();
		
		l.add("Mumbai");
		l.add("Mumbai");
		l.add("Mumbai");
		l.add("Thane");
		l.add("Pune");
		l.add("Nagar");
		
		Iterator r1 = l.iterator();
		
		while(r1.hasNext()) {
			
			System.out.println(r1.next());
		}
		
		

	}

}
