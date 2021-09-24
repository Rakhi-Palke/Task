package exception;

public class ArrayIndexDemo {

	public static void main(String[] args) {
		
		try {
			 int a[]   = {1,2,3,4,5};   
			 System.out.println(a[6]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Index Exception Occure  "+ e);
			//String message = e.getMessage();
			
		}
		System.out.println("Out Of data");

	}

}
