package com.example.demo.interfacedemo;

interface Vehicle {
	int  changeGear(int n);
	int  changeSpeed(int s);
	
}

class Bike implements Vehicle {
	
	int speed= 20;
	int gear =2;
	public int  changeGear(int n) {
		return n+gear;
		
	}
	public int  changeSpeed(int s) {
	   return s+speed;
		
	}student12 S
	
}

public class InterfaceTest {

	public static void main(String[] args) {

		
		Bike b1 = new Bike();
		System.out.println(b1.changeGear(3));
		System.out.println(b1.changeSpeed(50));
		
	}

}
        
        
