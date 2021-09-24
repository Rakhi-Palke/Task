package com.collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>();
		v1.add("Mumbai");
		v1.add("Mumbai");
		v1.add("Mumbai");
		v1.add("Thane");
		v1.add("Pune");
		v1.add("Nagar");
		
     Iterator r1 = v1.iterator();
		
		while(r1.hasNext()) {
			
			System.out.println(r1.next());
		}
		
	}
}
