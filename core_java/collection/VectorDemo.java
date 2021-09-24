package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		List a1 = new ArrayList();
		
		
		a1.add(10);
		a1.add(20);
		a1.add("Rahul");
		a1.add(88);

		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		System.out.println(a1.indexOf("Rahul"));
		a1.remove(0);
		System.out.println("After removing elements at 0 ");
		for(int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		Iterator itr = a1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());	
		}
	}
}
