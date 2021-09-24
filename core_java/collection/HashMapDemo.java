package com.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> m = new HashMap<Integer,String>();
         
		m.put(123301,"Mumbai");
		m.put(123301,"Mumbai");
		m.put(123302,"Pune");
		m.put(null, null);
		m.put(123303,"Nashik");
		m.put(123304,"Nagar");
		m.put(123305,null);
		m.put(123306,"");
		
	System.out.println(m);
	
	for(Map.Entry m1 :m.entrySet()) {
		
		System.out.println(m1.getKey()+"   "+m1.getValue());
	}
		
		
	}

}
