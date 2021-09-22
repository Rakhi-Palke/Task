package EduBridge;
  
import java.util.Scanner;

public class Cal_Salary {

	public static void main(String[] args) {		
		int savings;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary and number of shifts  ");
		int salary = sc.nextInt();
		int Shifts = sc.nextInt();
		
		if (salary>8000){
			System.out.println("Salary too large");
			
		}else if(salary<0){
	    	System.out.println("Salary too small");
	    }
		else if(Shifts<0){
			System.out.println("Shift too small");	
		}else{
			int result = calculateSal(salary,Shifts);
					System.out.println("The Total Saving is : "+result);
				}
		}
	   
	static int calculateSal(int salary,int Shifts){
		
		int remain  = (salary/2) ;
		int shift_sal = (salary/100)*(Shifts*2);
	    int savings = remain+shift_sal;
		return savings;
	}
}


