package EduBridge;

public class Inheritance {

	public static void main(String[] args) {
	
		Father f = new Father();
		f.addition();
		f.subtraction();

		Son s = new Son();
	    s.addition();
	  s.addition();
	  s.addition();
		s.Division();
		s.subtraction();
		
	}

}
class Father{
	public void addition(){
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println("Addition : "+c);
	}
	public void subtraction(){
		int d = 40;
		int e = 30;
		int f = d-e;
		System.out.println("Subtraction : "+f);
	}

}
class Son extends Father{
	
	public void addition(){
		int a =10;
		int b=20;
		int c=a+b;
		System.out.println("Addition : "+c);
	}
	public void Division(){
		int d = 40;
		int e = 20;
		int f = d/e;
		System.out.println("Division : "+f);
	}
}
