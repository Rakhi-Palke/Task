package EduBridge;

public class Constructor {
	
	public static void main(String[] args) {

		C c = new C("XYZ");	
}
}class A{
	A(){
		System.out.println("Grandparent class");
	}
}
class B {
	B(){
		System.out.println("I am Rakhi");
	}
	B(int a){	
		System.out.println("the value of a : "+a);
	}
	  
}
class C extends B{
	C(){
		
	}
	C(String s){
		super(100);
		System.out.println("the string is : "+s);
	}
}