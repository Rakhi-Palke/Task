package com.collection;

import java.util.Collections;
import java.util.TreeSet;

class Student implements Comparable<Student>{
	Integer rollNumber;
	String name;

	public Student() {}
	
	public Student(Integer rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		return this.rollNumber + o.rollNumber;
	}
	
}
public class SetDemo1 {

	public static void main(String[] args) {

	  TreeSet<Student> ts = new TreeSet<Student>();
      Student s1 = new Student(101,"Rahul");
      ts.add(s1);
      ts.add(new Student(104,"Umesh"));
      
      for(Student s: ts) {
    	   
    	  System.out.println("Roll No = "+s.getName()+"  "+
    	                       "Name = "+s.getRollNumber());
      }
	}

}
