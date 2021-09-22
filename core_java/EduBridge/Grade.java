package EduBridge;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Marks ");
   double Marks = sc.nextDouble();
   
   if(Marks<25){
	   System.out.println(" Grade J ");
   }
   if(Marks>25 && Marks<=45){
	   System.out.println(" Grade Z ");
   }
   if(Marks>45 && Marks<=50){
	   System.out.println(" Grade D ");
   }
   if(Marks>50 && Marks<=60){
	   System.out.println(" Grade C ");
   }
   if(Marks>60 && Marks<=80){
	   System.out.println(" Grade B ");
   }
   if(Marks>80){
	   System.out.println(" Grade A ");
   }
   
	}

}
