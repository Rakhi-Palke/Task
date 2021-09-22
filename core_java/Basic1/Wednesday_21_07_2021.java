package Basic1;

public class Wednesday_21_07_2021 {
	
	public static void main(String[] args) {
		Arithmatic_Operation.Add();
		Arithmatic_Operation.Sub();
		Arithmatic_Operation.Mul();
		Arithmatic_Operation.Div();
	}
}
class Arithmatic_Operation{
		static void Add(){
		int a=10;
		int b=20;
		int c = a+b;
		System.out.println("Addition is : "+c);
	}
	static void Sub(){
		int a=50;
		int b=30;
		int c = a-b;
		System.out.println("Subtraction is : "+c);
	}
	static void Mul(){
		int a=5;
		int b=4;
		int c = a*b;
		System.out.println("Multiplication is : "+c);
	}
	static void Div(){
		int a=40;
		int b=20;
		int c = a/b;
		System.out.println("Division is : "+c);
	}
}
