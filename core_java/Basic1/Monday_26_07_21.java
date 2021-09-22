package Basic1;


class A{
	//data members or variable declartions 
	int a=10;   
	String S="Rakhi";

	//user defined method
	public void abc(){
		System.out.println("This is normal method creation");
	}
	
	//Initilizer block
	{
		System.out.println("Welcome to Edubridge");
		String s = "This is Init Block concept";
		System.out.println(s);
	}
	
	//default constructor
	A(){
		System.out.println("This is default constructor");
	}
	//static block
	static{
		System.out.println("This is static Block");
	}
}

public class Monday_26_07_21 {

	public static void main(String[] args) {
		
		A a = new A();
	}
}
