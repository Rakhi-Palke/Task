package com.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		
		tm.put(101,"Rahul");
		tm.put(101,"Rahul");
		tm.put(102,"Krishna");
		tm.put(107,"Rahul");
		tm.put(108,"Ram");
		tm.put(103,null);
		tm.put(104,"Nitin");
		tm.put(105,null);
		tm.put(106,null);
		
		System.out.println(tm);
		for(Map.Entry<Integer,String> m1 : tm.entrySet()) {
			System.out.println(m1.getKey()+"   "+m1.getValue());
		}
		
		TreeMap<String,Integer> tm1 = new TreeMap<String,Integer>();
		
		tm1.put("A",123);
		tm1.put("Z",125);
		tm1.put("F",128);
		tm1.put("R",129);
		tm1.put("I",121);
		tm1.put("P",120);
		tm1.put("N",123);
		tm1.put("A",123);
		tm1.put("M",123);
		tm1.put("P",123);
		
		for(Map.Entry<String,Integer> m1 : tm1.entrySet()) {
			System.out.println(m1.getKey()+"   "+m1.getValue());
		}
	}

}
