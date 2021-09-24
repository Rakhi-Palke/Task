package com.collection;

import java.util.TreeSet;

class Account implements Comparable<Account>{
	private Integer accountNumber;
	private String accountName;
	private String accountType;
	private String address;
	private String panNumber;
	private String adharNumber;
	private Double limit;
	
	
	
	public Account() {
		
	}
	
	public Account(Integer accountNumber, String accountName, String accountType, String address, String panNumber,
			String adharNumber, Double limit) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.address = address;
		this.panNumber = panNumber;
		this.adharNumber = adharNumber;
		this.limit = limit;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
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
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public Double getLimit() {
		return limit;
	}
	public void setLimit(Double limit) {
		this.limit = limit;
	}

	@Override
	public int compareTo(Account o) {
		 
		if(this.getAccountNumber() == o.getAccountNumber())
			return 0;
		else if (this.getAccountNumber() < o.getAccountNumber())
			return -1;
		else 
			return 1;
		
//		int diff = this.getAccountNumber() - o.getAccountNumber();
//		if(diff == 0) return 0;
//		else if(diff < 0) return -1;
//		else return 1;
	}
	
	
	
	
}

public class SetDemo {

	public static void main(String[] args) {
		
		TreeSet<Account> s1 = new TreeSet<Account>();
		Account a1 = new Account(111001, "Rahul", "Saving", "Pune", "ADFDF10D","3985798987", 50000.00);
	    s1.add(a1);
		
	    Account a2 = new Account(111001, "Rahul", "Saving", "Pune", "ADFDF10D","3985798987", 50000.00);
	    s1.add(a2);
	    Account a3 = new Account(111001, "Rahul", "Saving", "Pune", "ADFDF10D","3985798987", 50000.00);
	    s1.add(a3);
	    Account a4 = new Account(111002, "Krishna", "Saving", "Nagar", "ADFGR10D","3985000982", 50000.00);
	    s1.add(a4);
	    Account a5 = new Account(111003, "Nitin", "Current", "Mumbai", "ADF56TF","3985798765", 50000.00);
	    s1.add(a5);
		System.out.println(s1);
		
		for(Account a: s1) {
			
			System.out.println("Name = "+a.getAccountName()+"||"+
			                    "Account Number = "+a.getAccountNumber()+"||"+
					             "pan Number = "+a.getPanNumber()+"||"+
					             "Account Type = "+a.getAccountType()+"||"+
					             "Adhar Number = "+a.getAdharNumber()+"||"+
					             "Account Limit = "+a.getLimit()
					             
					          );
		}
	
	}

}
