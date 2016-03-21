package lab2;

public class UseBankAccount {
	public static void main(String[] args){

		BankAccount vijay = new BankAccount("Vijay","Mumbai",5000);
		BankAccount sbi = new BankAccount("SBI","Mumbai",2000);
		
		vijay.deposit(100);
		
		System.out.println(vijay);
		System.out.println(sbi);
		
		vijay.tranfer(sbi, 1000);
		
		System.out.println(vijay);
		System.out.println(sbi);
		
		vijay.deposit(100);
	}
	
}
