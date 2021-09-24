package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
	
		List a1 = new ArrayList();
		
		a1.add(10);
		a1.add(10);
		a1.add(10);
		a1.add("Mumbai");
		
		Iterator  i = a1.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
