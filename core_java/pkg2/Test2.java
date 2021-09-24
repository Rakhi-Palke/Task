package com.example.demo.pkg2;

 public class Test2 {
	public int  num1 = 10,num2 =20;
    protected void addition() {
		int add = num1+num2;
		System.out.println(add);
	}
	
}

class B extends Test2 {
	
	int  num2;
	int  multiplication(int a, int b)
	{
		return a*b;
	}
	
}

class C extends B{
	double division(int a, int b){
		 
		return a/b;
	}
}

