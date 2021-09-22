package EduBridge;

public class Interface_Example {

	public static void main(String[] args) {
		java j = new java();
		j.code();
		j.code_language();
		j.learn();
		j.spring();
		j.spring_framework();
	}

}
interface language{
	void code();
	void learn();
	
	default void code_language(){
		System.out.println("this is coding");
	}	
}
interface framework{
	void spring();
	
	default void spring_framework(){		
	}
}
class java implements language , framework{
	public void code() {
		System.out.println("this is code in java");		
	}
	public void learn() {
		System.out.println("I am learning java");
	}
	public void spring() {
		System.out.println("I am doing java project using spring");
		
	}
}
