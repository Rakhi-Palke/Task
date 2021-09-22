package Monday_9_08;

import java.util.*;

public class Set_example {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
	    LinkedHashSet<String> h1 = new 	LinkedHashSet<>();
	    TreeSet<String> t = new  TreeSet<>();
	    
	    
	    h.add("Rakhi");
	    h.add("Riya");
	    h.add("null");
	    h.add("Riya");
	   
	   // System.out.println(h);
	    
	    
	    h1.add("Rakhi");
	    h1.add("Riya");
	    h1.add("null");
	    h1.add("Rakhi");
	   // System.out.println(h1);
	    
//	    t.add("Richa");
//	    t.add("arya");
//	    t.add("Null");
//	    t.add("Riya");
	  //  t.retainAll(h1);
	    t.add("Rakhi");
	    t.add("Riya");
	    t.add("null");
	    t.add("Rakhi");
	  System.out.println(t.containsAll(h1));
	  
	
	  
	}

}
