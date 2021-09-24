package exception;

public class FormatException {

	public static void main(String[] args) {
		
//			String s1 = "12345";
//			
//			String s2 = "12345";
//			
//			int rollNumber1 = Integer.parseInt(s1);
//			int rollNumber2 = Integer.parseInt(s2);
//			
//			
//			System.out.println(rollNumber1+rollNumber2);
			
//			String s3 = "A12345";
//			 int rollNumber = Integer.parseInt(s3);
		
		int num = 1234567;
		
		String s5 = String.valueOf(num);
			 
			 try {
				 
				 String s3 = "A12345";
				 
				 int rollNumber = Integer.parseInt(s3);
				 
				 System.out.println(rollNumber);
				 
			 }catch(NumberFormatException e) {
				 
				 System.out.println("Please Enter the Number");
				 
			 }
			// valueOf() and toString Method 
			 
//        Integer s6 = null;
//        System.out.println(String.valueOf(s6));
//        System.out.println(s6.toString());
        
	}

}
