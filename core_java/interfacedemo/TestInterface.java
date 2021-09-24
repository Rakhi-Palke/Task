package com.example.demo.interfacedemo;

interface A{
    int add(int a, int b);
	int  sub(int a, int b);	
}

class T{
	
	public int add(int a, int b) {
		return a+b;
	}
	int  mul(int a, int b) {
		return a*b;
	}	
}

class S{
	int  mul(int a, int b) {
		return a*b;
	}	
}
class B  extends T implements A{
	public  int  add(int a,int b ) {
		
		return a+b;
	}
	public  int  sub(int a, int b) {
		 return a-b;
	}
	
}

public class TestInterface {

	public static void main(String[] args) {

		B b1 = new B();
		System.out.println(b1.add(10,20));
	}

}
