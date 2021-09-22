package EduBridge;

public class Abstrct_example {

	public static void main(String[] args) {
		
	}
}
abstract class  shape{
	abstract void calculate_area();
	abstract void calculate_perimeter();
	abstract void calculate_perimeter_shape1();
	
	private final void calculate_area_shape() {
		
	}
    private final void calculate_perimeter_shape() {
		
	}
	
}

class Circle extends shape{
	void calculate_area() {
		System.out.println("this is area of circle ");
	}
	void calculate_perimeter() {
		System.out.println("this is perimeter of circle");	
	}
	void calculate_radius(){
		System.out.println("this is radius of circle");
	}
	
	void calculate_perimeter_shape1() {
		
		
	}
	
}
class square extends shape{

	void calculate_area() {
      System.out.println("this is area of square");
		
	}
	void calculate_perimeter() {
	System.out.println("this is perimeter of square");
	}
	void claculate_side(){
		System.out.println("this is side of square");
	
}

	void calculate_perimeter_shape1() {
	
		
	}
}