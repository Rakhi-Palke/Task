package EduBridge;

import java.util.Scanner;

public class Exm1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks ");
	  String Marks = sc.next();
	  
	   switch(Marks){
		   case "A":
		   {
		 System.out.println("Your marks is above 80 ");
		   }break;
		   case "B":
		   {
		 System.out.println("Your marks is between 60 to 80 ");
		   }break;
		   case "C":
		   {
		 System.out.println("Your marks isbetween 40 to 60 ");
		   }break;
		   case "F":
		   {
		 System.out.println("Your marks is above 40 ");
		   }break;
		   default:
		   {
		 System.out.println("Invalid grade");
		   }
	   }

	}

}
