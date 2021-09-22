package EduBridge;

public class Friday_30_07 {

	public static void main(String[] args) {
	
		Add a = new Add();
		a.add(20, 40 , 50);

	}
}
class Add {
	Add(){
		System.out.println("Good Morning");
	}
	void add(int a,int b,int c){
		System.out.println("first method : "+(a+b+c));
	}
	void add(int a,int b){
		System.out.println("second method : "+(a+b));
	}
}
