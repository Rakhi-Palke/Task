package example1;

import java.util.Scanner;

public class encoding {
	 public static void main(String[] args)
	    {
	    
	    	Scanner sc = new Scanner(System.in);
	    	String str = sc.nextLine();
	        count(str);
	    }
    public static void count(String str)
    {
        int n = str.length();
        for (int i = 0; i < n; i++) {
        	
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
            {
                count++;
                i++;
            }          
            System.out.print(str.charAt(i));
            System.out.print(count);
        }
    }  
}
