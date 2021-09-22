package Friday;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		String s = "Rakhi";
		StringBuffer s1 = new StringBuffer("Rakhi");
		StringBuilder s2 = new StringBuilder("Rakhi");
		
		s2.append(" Palke");
		System.out.println(s2);
		System.out.println(s1.charAt(2));
		System.out.println();
		
		s1.offsetByCodePoints(0, 2);
		System.out.println(s1);
		s1.subSequence(2, 4);
		System.out.println(s1);
		try{
			s1.wait(4);
		}catch(Exception e){
			
		}
		
	}

}
