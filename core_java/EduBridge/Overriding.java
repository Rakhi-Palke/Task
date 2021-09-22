package EduBridge;

public class Overriding {

	public static void main(String[] args) {
		int a = 10;
		int b= 20;	
		son2 s = new son2();
		s.cycle(a, b);
	}

}
class GgFather{
	char c= 'E';

	void cycle(int a,int b){
		System.out.println();
	}	
}
class GFather extends GgFather{
	void cycle(int a,int b){
		//System.out.println("its not old cycle"+(a+b));
	}
}
class Father1 extends GFather{
	int a= 10;
	int b= 20;
	void cycle(){
		super.cycle(a, b);
	}
	
}
class son2 extends Father1{
	{
		super.cycle();
		System.out.println(super.a);	
	}
	int a=100;
	void cycle(int a, int b){
		System.out.println("its NEW cycle");
		System.out.println(super.b);
	}
	
}