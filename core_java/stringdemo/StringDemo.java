package stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		
		char[] ch = {'1','1','1','1'};
		
		String s = new String(ch);
		System.out.println(s);

		char[] ch1 = {'2','2','2','2'};
		
		String s1 = new String(ch1);
		System.out.println(s1);
		
		System.out.println(s1+s);
		
		String s3 = "Welcome";
		String s4 = new String("Medvanture");
		System.out.println(s3.charAt(1));
		System.out.println(s3.concat(s4));
		
		
		// equalTo and ==
		System.out.println();
		
		
	}

}
