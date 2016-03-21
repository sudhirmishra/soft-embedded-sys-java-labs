# Lab 2 #

1. Create a `BankAccount` class having	
	* Constructor: Which will accept a double value for `balance`.
	* Methods:
		* `deposit`: Which will accept a double value
		* `withdraw`: Which will accept a double value, check if balance is greater than the value +minimum balance
		* `getBalance`: which will return the balance.
		
2. Modify the `BankAccount` class 	
	* Implement unique and sequential account numbers for all BankAccounts created (Starting with 180020131111).
	* Variable to store `numberOfTransactions`. Modify all the methods to increment this for any transaction.
	* Method for transfer money between two bank accounts.
		* This method should use the existing methods, withdraw and deposit. 
		* It should check if there is sufficient balance before transferring. 
		* Increment `numberOfTransactions` for both accounts 
		
3. Modify the `BankAccount` class	
	* Implement a Class `LastTransaction` which will have a String variables one for type of last transaction: Withdraw, Deposit or Transfer are possible values.
	* Implement a class `PersonalDetails`. This will have 2 String variables: `name` and `address`.  Override the `toString ()` method.
	* Modify the `BankAccount` class to have objects of `LastTransaction` and `PersonalDetails` as fields. Override the `toString ()` method to print Account number, Name, Address, Last transaction.
	* Modify the constructor to accept the details for name and address. 
	* Modify the methods withdraw, deposit or transfer such that this field is updated. Override the `toString ()` method.

4. Create 2 BankAccounts with initial deposits 5000 and 2000 and with names and address of your parent and yourself. Do withdraw, deposit and transfer. After each operation print the `toString()` of your account.
