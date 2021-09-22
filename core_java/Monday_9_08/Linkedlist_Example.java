package Monday_9_08;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist_Example {

	public static void main(String[] args) {
	LinkedList<String> a = new LinkedList<String>();
		
		
          a.add("Rakhi");
          a.add("Sanika");
          a.add("Kiran");
          a.add("Pooja");
          a.add("Priya");
          a.add("Kiran");
          a.add("Rakhi");
          a.add("Rakhi");
          a.add("Pooja");
        System.out.println("Initial list of elements : "+a);
        
        a.remove("Rakhi");
      	System.out.println("After invoking remove(object) method : "+a);  
      	
      	LinkedList<String> a1 = new LinkedList<String>();
      	a1.add("ravi");
      a1.add("riya");
      	   	
	System.out.println("After invoking add(element) method : "+a);  
	
	       a.removeFirst();
	       System.out.println("After removing removeFirst(element) method : "+a); 
	       a.removeAll(a1);
	       System.out.println("After removing removeAll(element) method : "+a); 
	       a.removeLast();
	       System.out.println("After removing removeLast(element) method : "+a); 
      
	       a.removeLastOccurrence("Rakhi");
	       System.out.println("After removing removeLastOccurence(element) method : "+a);
	       a.removeFirstOccurrence("Pooja");
	       System.out.println("After removing removeFirstOccurance(element) method : "+a);
	}

}
