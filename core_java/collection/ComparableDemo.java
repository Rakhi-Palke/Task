package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MarksCompare implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if(o1.getMarks() < o2.getMarks())
			return -1;
		else if(o1.getMarks() > o2.getMarks())
			return 1;
		else
		return 0;
	}	
}

class Student1 implements Comparator<Student1>{
	Integer rollNumber;
	String name;
	Integer marks;
	
	
	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public Student1() {}
	
	public Student1(Integer rollNumber, String name,Integer marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks =  marks;
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
	public int compare(Student1 o1, Student1 o2) {
		
		if(o1.getRollNumber() < o2.getRollNumber())
			return -1;
		else if(o1.getRollNumber() > o2.getRollNumber())
			return 1;
		else
		return 0;
	}	
}


public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student1> list = new ArrayList<Student1>();
		list.add(new Student1(103,"Rahul",65));
		list.add(new Student1(102,"Nitin",48));
		list.add(new Student1(105,"Rajiv",98));
		list.add(new Student1(104,"Ram",74));
		list.add(new Student1(101,"Kedar",76));
		
		MarksCompare mk1 = new MarksCompare();
		Collections.sort(list,mk1);
		
		for(Student1 s: list) {
			System.out.println("Roll No= "+s.getRollNumber()+ "  "+
		                        "Name = "+s.getName());
		}
		

	}

}
