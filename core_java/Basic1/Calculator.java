package Basic1;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		System.out.println("Hiii...Welcome To Edubridge Calculator \n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Which Operation you have to perfom in calculator\n ");
	
		System.out.println("Available functions are "+"ADD SUB MUL DIV\n");
		String Operations = sc.next();
	
      
	  switch(Operations){
		
		case "ADD":
			 Addition.add();
			break;
			
		case "SUB":
			Subtraction.sub();
			break;
			
		case "MUL":
				Multiplication.mul();
			break;
			
		case "DIV":
			Division.div();
			break;
		   default:
				System.out.println("Invalid operator");
		
		}

		
		}	

	}	





