package com.example.demo.pkg1;

import com.example.demo.pkg2.*;

class A1 extends Test2 {
	
	
}

class B1{
	
}

public class Test1 {

	public static void main(String[] args) {
		
		A1 a1 = new A1();
		int number1  = a1.num1;
		int number2  = a1.num2;
		int add  =  number1+number2;
		 System.out.println(add);
	}

}
