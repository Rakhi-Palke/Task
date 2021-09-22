package Monday_9_08;

import java.util.ArrayList;
import java.util.LinkedList;

public class DifferenceArrayList_LinkedLIst {

	public static void main(String[] args) {
		
	        long startTime = System.currentTimeMillis();  
	        ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	        

	        for (int i=0; i<10000; i++){  
	        	 list.add("Ravi");   
	        }  
	        System.out.println("Time taken by ArrayList: " +
	        (System.currentTimeMillis() - startTime) + "ms");  
	        
	        startTime = System.currentTimeMillis();  
	        LinkedList<String> al=new LinkedList<String>();  
	       

	        for (int i=0; i<10000; i++){  
	        	   al.add("Ravi");
	        }  
	        System.out.println("Time taken by LinkedList: " + 
	        (System.currentTimeMillis() - startTime) + "ms");  
	    }

	}


