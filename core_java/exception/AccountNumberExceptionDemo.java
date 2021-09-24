package exception;

class AccountNumberException extends Exception
{
	public AccountNumberException(String s)
	{   
		//to call super class constructor
		super(s);
	}
}


public class AccountNumberExceptionDemo {

	public static void main(String[] args) {
		
       try{
    	  throw new  AccountNumberException("Enter Proper Number");
       }catch(AccountNumberException e) {
    	   
    	   System.out.println("Exception has been cought");
    	   System.out.println(e.getMessage());
    	   
       }
	}

}
