package Examples;

public class OPPS_Concept {

	public static void main(String[] args) {
	I1 i = new I1();
		i.monday();
	}

}
interface A1{
	void monday();
}
interface B1 extends A1{
	void monday();
}
interface B2 extends A1{
	void monday();
}
interface B3 extends A1{
	void monday();
}
interface A2{
	void monday();
}
interface C1 extends A2{
	void monday();
}
interface C2 extends A2{
	void monday();
}
interface D1 extends B2,B3,C1{
	void monday();
}
interface E1 extends B1,C2{
	void monday();
}
interface F1 extends D1,E1{
	void monday();
}
interface G1 extends F1,C2{
	void monday();
}
interface H1{
	void monday();
}
class I1 implements H1,G1{

	@Override
	public void monday() {
		System.out.println("OOPs concept are completed");
		
	}
	
	}
	


