package Monday_9_08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		a.add(null);
		a.add("Rakhi");
		a.add("Priya");
		
		
		//basic iterator way
		Iterator<String> i = a.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		System.out.println("******************************");
		
		//using lambda expression
		a.forEach(ABC->{System.out.println(ABC);});
	
	
		LinkedList<String> ll=new LinkedList<String>();  
		         ll.add("Ravi");  
		           ll.add("Vijay");  	           
		           ll.add("Ajay");  
			           //Traversing the list of elements in reverse order  
			    Iterator i1=ll.descendingIterator();  	         
			    while(i1.hasNext())  
			           {  
			               System.out.println(i1.next());  
		           }

	
	
	}

}
