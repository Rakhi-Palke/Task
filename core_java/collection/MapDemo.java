package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(101,"Rahul");
		m.put(102,"Krishna");
		m.put(103,"Ram");
		m.put(104,"Siva");
		m.put(105,"Nitin");
		
		System.out.println(m);
		m.put(101,"Jagan");
		System.out.println(m);
		
		Map<String,Double> m1 = new HashMap<String,Double>();
		
		m1.put("ACDF88FG",50000.56);
		m1.put("ACD7845A",20000.16);
		m1.put("ACDF589F",70000.48);
		m1.put("ACG659AS",60000.56);
		m1.put("ACDF768B",80000.57);
		m1.put("ACDF589F",100000.86);
		m1.put(null,100000.59);
		m1.put(null,200000.51);
		m1.put("ACDF589Z",null);
		m1.put("ACDF589W",null);
		m1.put("ACDF589Y",null);
		
		
		System.out.println(m1);
		
		Map<String,Float> m2 = new HashMap<String,Float>();
		
		m2.put("Name",20.5f);
		
		System.out.println(m2);
		

	}

}
