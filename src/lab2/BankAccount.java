package lab2;

import java.math.BigInteger;

public class BankAccount {
	
	private double balance;
	
	private static BigInteger accountCount = new BigInteger("180020131111");
	
	private BigInteger accountNo;
	private int numberOfTransactions = 0;
	
	private LastTransaction last = LastTransaction.NONE;
	private PersonalDetails details;
	
	public BankAccount(double balance){
		
		this.balance = balance;		
		accountNo = new BigInteger(BankAccount.accountCount.toString()); 
		accountCount = accountCount.add(new BigInteger("1"));

	}
	
	public BankAccount(String name, String address, double balance){
		this(balance);
		details = new PersonalDetails(name, address);
	}
	
	public void deposit(double amount){
		balance += amount;
		last = LastTransaction.DEPOSIT;
		incrementTransactionCount();
	}
	
	public boolean withdraw(double amount){
		if( balance > amount ){
			balance -= amount;
			last = LastTransaction.WITHDRAW;
			incrementTransactionCount();

			return true;
		}
		return false;
	}
	
	public boolean tranfer(BankAccount destination, double amount){
		BankAccount source = this;
		
		if(source.withdraw(amount)){
			destination.deposit(amount);
			
			return true;
		}
		
		return false;

	}
	
	public double getBalance(){
		return balance;
	}
	
	public void incrementTransactionCount(){
		numberOfTransactions += 1;
	}
	
	public String toString(){
		return "Account : " + accountNo
				+ ", Personal Details : " + details 
				+ ", Last Transaction : " + last;
	}
	
}
