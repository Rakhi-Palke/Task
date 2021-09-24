package exception;

public class StringDemo {

	public static void main(String[] args) {
// Not handle by developer		
//		String s1 = null;
//		System.out.println(s1);
//		System.out.println(s1.charAt(0));
		

		//  handle by developer
		try {
			
			String s1 = null;
			System.out.println(s1.charAt(0));
		}catch(NullPointerException e) {
			
			System.out.println("Null Pointer Exception  ");
			
		}

	}

}
