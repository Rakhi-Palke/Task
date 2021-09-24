package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		a1.add("Krishna");
		a1.add("Ram");
		a1.add("Jatin");
		a1.add("Rahul");
		a1.add("Hari");
		
		Iterator i = a1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
         
	}

}
