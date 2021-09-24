package com.example.demo.poly;

class Addition{
	public  Addition() {
		System.out.println("No argument Constructor");
	}
	
public Addition(int i, int j) {
		System.out.println(i+j);
	}

public Addition(int num1,int num2,int num3) {
	System.out.println(num1+num2+num3);
}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		Addition a2 = new Addition(10,20);
		Addition a3 = new Addition(10,20,30);
	
	}

}
