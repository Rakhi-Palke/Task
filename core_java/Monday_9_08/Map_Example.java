package Monday_9_08;

import java.util.*;

public class Map_Example {

	public static void main(String[] args) {
		
		HashMap h = new HashMap<>();
		LinkedHashMap l = new LinkedHashMap<>();
		TreeMap t = new TreeMap<>();
		
		h.put(101, "Rakhi");
		h.put(102, "null");
		h.put(101, "Ragini");
		h.put(null, "Rakhi");
		h.put(101, "Ragini");
		h.put(null, "Richa");
		System.out.println(h);
		
	
	
//		l.put(101, "Rakhi");
//		l.put(102, "null");
//		l.put(101, "null");
//		l.put(null, "Rakhi");
//		l.put(101, "Ragini");
//		l.put(null, "Richa");
//		System.out.println(l);
		
		
		
//		t.put(101, "Rakhi");
//		t.put(105, "Richa");
//		t.put(101, "null");
//		t.put(102, "Rakhi");
//		t.put(103, "null");
//		t.put(104, "Richa");
//		System.out.println(t);
//		
		

	}

}
