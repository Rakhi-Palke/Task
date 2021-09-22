package Monday_9_08;

import java.util.ArrayList;

public class Arraylis_example {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList<>();
		
		System.out.println("Initial list of elements : "+a);
          a.add("Rakhi");
          a.add(12345);
          a.add(true);
          
      	System.out.println("After invoking add(E e) method : "+a);  
      	
      	a.add(2, "Pooja");
      	
	System.out.println("After invoking add(int index,E element) method : "+a);  
	
	ArrayList a1 = new ArrayList<>();
      a1.add("Kiran");
      a1.add(234562);
      
      a.addAll(1,a1);
  		System.out.println("After invoking addAll(int index,caollection<? extends c) method : "+a);    
	
  		a.add(0, "pune");
  		System.out.println("After invoking add(E e) method : "+a);
	}

}
