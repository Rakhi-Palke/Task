package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class MultipleException {

	public static void main(String[] args) {
		
		try {
			
//			// File Exception
//			File file = new File("D://practice1//Tex.txt");
//			FileReader fr = new FileReader(file);
			
			//NullPointer Exception 
//			
//			Integer s6 = null;
//	        System.out.println(String.valueOf(s6));
//	        System.out.println(s6.toString());
	        
//	        // Array Exception
//	        int a[]   = {1,2,3,4,5};   
//			  System.out.println(a[6]);
			  
			  // divide by zero 
			  int num = 100;
			  int div  = num/0;
			  System.out.println(div);
            
			
		}
//		catch(FileNotFoundException e) {
//	           System.out.println("File does not exist");
//	        }
		
        catch(NullPointerException e ) {
        	System.out.println("Null Pointer Exception");
		}

        catch(ArrayIndexOutOfBoundsException e) {
		    	
			System.out.println("Index Exception Occure  ");
	    }
		catch(Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			
		}
		
		// next code will be here 

}
}
