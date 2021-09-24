package com.example.demo.encapsulation;

class Account {
	 private int accountNumber;
	 private String accountName;
	 private String address;
	 private String panNumber;
	 
	 public Account() {
		 
	 }
	 
	public Account(int accountNumber, String accountName, String address, String panNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.address = address;
		this.panNumber = panNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	 
	 
}


public class AccountTest {

	public static void main(String[] args) {
		
      Account a1  = new Account(1234567,"Rahul","Mumbai","ACFW489CS");
      System.out.println(a1.getAccountName());
      System.out.println(a1.getAccountNumber());
      System.out.println(a1.getAddress());
      System.out.println(a1.getPanNumber());
      
      a1.setAccountName("Nilesh");
      a1.setAccountNumber(12345986);
      a1.setAddress("Pune");
      a1.setPanNumber("MP2349FR");
      System.out.println();
      System.out.println(a1.getAccountName());
      System.out.println(a1.getAccountNumber());
      System.out.println(a1.getAddress());
      System.out.println(a1.getPanNumber());
      
		
	}

}
