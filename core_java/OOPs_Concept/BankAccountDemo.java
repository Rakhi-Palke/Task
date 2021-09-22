package OOPs_Concept;

public class BankAccountDemo {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount("Rakhi","13236783782");
		b.deposite(500);
		b.deposite(1500);
	
	System.out.println("Balance is : "+b.getBalance());
		b.withdraw(400);
		System.out.println("Balance is : "+ b.getBalance());
	}

}
class BankAccount{
	 private String accountName;
	 private String accountNumber;
	 private double balance;
	 
	 public BankAccount(String accName,String accNum){
		 accountName = accName;
		 accountNumber = accNum;
		 balance = 0;
	 }
	 
	 
	public String getAccountName() {
		return accountName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public double deposite(double amount){ 
		if (amount > 0){
			balance= balance+amount;
			return balance;
		}
		
		
		return balance;
	}
	public double withdraw(double amount){
		if (amount > balance){
			return amount;
		}else{
			balance= balance-amount;
		return balance;
	}		
	}
}

	

