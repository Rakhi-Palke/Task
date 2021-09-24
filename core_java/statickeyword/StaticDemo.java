package com.example.demo.statickeyword;

class A{
	
	static class B {
		public void show() {
			System.out.println("mehtod inside nested static class");
		}
	}
	
	static double  rateOFInterest = 3.14;
}

public class StaticDemo {

	public static void main(String[] args) {
		
		A.B a  = new A.B();
		
		a.show();
		
      System.out.println("main Static block");
      System.out.println("static variable "+A.rateOFInterest);
	}
	
	static void ABC() {
		 System.out.println("Static mehtod ABC ");
	}
	static {
		System.out.println("this is static block");
	}

}
