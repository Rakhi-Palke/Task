package com.example.demo.poly;

class Students {
	String Name;
    int rollNo;
    int Age;
    String address;
    String subject;
    double percentage;
    
    public Students() {
    	
    }
    
	public Students(String name, int rollNo, int age, String address, String subject, double percentage) {
		super();
		Name = name;
		this.rollNo = rollNo;
		Age = age;
		this.address = address;
		this.subject = subject;
		this.percentage = percentage;
	}
	
	
	public Students(String name, int rollNo, double percentage) {
		super();
		Name = name;
		this.rollNo = rollNo;
		this.percentage = percentage;
	}


	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
   
}

public class Test5 {

	public static void main(String[] args) {
		
	}

}
