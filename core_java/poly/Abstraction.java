package com.example.demo.poly;

  abstract class Car1{
	
	abstract void showPrice(int price );
	void show() {
		
	}
	
}
 
 class CarSubclass extends Car1 {
	 
	 void showPrice(int price ) {
		 System.out.println(price);
		 System.out.println("Implemented Abstract Method of abstract class");
	 }
 }

public class Abstraction {

	public static void main(String[] args) {
		
		CarSubclass s1 = new CarSubclass();
		s1.showPrice(20000000);
	}

}
