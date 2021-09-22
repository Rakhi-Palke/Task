package EduBridge;

public class Hierarchical_inheritance {

	public static void main(String[] args) {
	
	  Daughter1 d = new Daughter1();
      d.Bike();
      d.car();
      d.cycle();              
	}
}

class Mother{
	int M_balance = 1000000;
	public void car(){
		System.out.println("This is car ");		
	}
	public void Bike(){
		System.out.println("This is Bike ");
	}
		
}
class Daughter1 extends Mother{
	int D1_balance = 1000;
	public void cycle(){
		System.out.println("This is cycle ");
	}
}

class Daughter2 extends Mother{
	int D2_balance = 2000;
	public void Scooty(){
		System.out.println("This is scooty ");
	}
}

