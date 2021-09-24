package com.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> s1 = new Stack<String>();
		s1.push("Rahul");
		s1.push("Rahul");
		s1.push("Rahul");
		s1.push("Nitin");
		s1.push("Kedar");
		
       Iterator r1 = s1.iterator();
		
		while(r1.hasNext()) {
			
			System.out.println(r1.next());
		}
		
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		
	}

}
