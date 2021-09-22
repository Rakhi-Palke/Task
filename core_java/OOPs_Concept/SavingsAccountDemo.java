package OOPs_Concept;

public class SavingsAccountDemo {

	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount("RAKHI","2863824632",10);
		s.deposite(500);
		System.out.println("Balance before Interest : "+s.getBalance());

		s.addInterest();
		System.out.println("Balance after Intesrest : "+s.getBalance());
	}

}
class SavingsAccount extends BankAccount{
	
	private double interestRate; 
	
	public SavingsAccount(String accName, String accNum,double rate) {
		super(accName, accNum);
	     interestRate = rate;
	}
	public void addInterest(){
		double interest = getBalance()* interestRate/100;
		this.deposite(interest);
	}
}
	
