package EduBridge;

public class Constructor_overloading {

	public static void main(String[] args) {
		
		Student s = new Student();
	    Student d= new Student(10,30);
	}
}
class Student{
	
	Student(){
		System.out.println("This is default Constuctor");
	}
	Student(int a, int b ){
		System.out.println("this is parameterized constructor "+(a+b));
	}
}
