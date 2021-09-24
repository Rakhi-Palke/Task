package com.example.demo.poly;

class Teacher{
	
	String sub = "Math";
	public void show() {
		
		System.out.println(sub);
	}
	
}
class Student1 extends Teacher{
	
	String sub = "History";
	public void show() {
		
		System.out.println(sub);
	}
	
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Student1 s1  = new Student1();
		s1.show();
		
		System.out.println();
		
	}

}
