package Basic1;

import java.util.Scanner;

public class Object {

	public static void main(String[] args) {
		Addition.add();
		Subtraction.sub();
		Multiplication.mul();
		Division.div();
		
	}

}
class Addition{
	static public void add(){
	Scanner sc = new Scanner(System.in);
     System.out.println("Enter two  value ");
     int a = sc.nextInt();
     int b = sc.nextInt();
     int c = a+b;
	System.out.println("The addition is : " +c);
	System.out.println("Do You Want To Continue "+"YES NO ");
	{
		
	}
}
}
class Subtraction{
	static public void sub(){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter two  value ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a-b;
    System.out.println("The operation is done");
	System.out.println("The subtraction is : " +c);	
	System.out.println("Do You Want To Continue "+"YES NO ");
}
}
class Multiplication{
	 static public void mul(){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter two  value ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a*b;
	System.out.println("The multiplication is : " +c);	
	System.out.println("Do You Want To Continue "+"YES NO ");
}
}
class Division{
	 static public void div(){
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter two value ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a/b;
	System.out.println("The Division is : " +c);
	System.out.println("Do You Want To Continue "+"YES NO ");
}
}