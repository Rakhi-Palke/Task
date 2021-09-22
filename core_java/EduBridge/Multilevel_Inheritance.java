package EduBridge;

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		S s = new S();
		s.Subtraction();
		s.Addition();
		s.multiplication();
		s.Addition();
		
	}

}
class Grandfather{
	void multiplication(){
		int a = 5;
		int b = 6;
		System.out.println("Multiplication : "+a*b);
	}
}
class F extends Grandfather{
	void Addition(){
		int a = 5;
		int b = 6;
		System.out.println("Addition : "+(a+b));
	}
}
class S extends F{
	void Subtraction(){
		int a = 6;
		int b = 5;
		System.out.println("Subtraction : "+(a-b));
	}
}
