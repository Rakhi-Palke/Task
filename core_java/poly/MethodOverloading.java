package com.example.demo.poly;

class Student{
	String name = "Raju";
	int age = 30;
	int rollno=101;
	void show() {
		System.out.println("No argument Method and doent have return type");
	}
	
	void show(String name) {
		System.out.println("Name="+name);
	}
	
	void show(String name,int age) {
		System.out.println("Name="+name);
		System.out.println("Age="+age);
	}
	
	
	void show(String name,int age, int rollNo) {
		System.out.println("Name="+name);
		System.out.println("Age="+age);
		System.out.println("Roll No="+rollNo);
	}
	
	
	
}


public class MethodOverloading {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.show();
		s1.show("Mikhilesh");
		s1.show("Ritesh",31);
		s1.show("Harish",35,102);
	}

}
