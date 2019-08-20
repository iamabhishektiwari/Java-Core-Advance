package com.abhishek.app;

import com.abhishek.func.Account;
import com.abhishek.func.CurrentAccount;
import com.abhishek.func.SavingAccount;

public class BankingApp {
	public static void main(String[] args) {
		Account savingAccount = new SavingAccount(123,"Abhishek",10000,1000);
		Account currAccount = new CurrentAccount(124,"Rambo",20000,-5000);
		savingAccount.deposit(10000);		
		savingAccount.checkBal();
		savingAccount.withdraw(2000);
		savingAccount.withdraw(200000);
		savingAccount.display();
		
		currAccount.deposit(10000);		
		currAccount.checkBal();
		currAccount.withdraw(2000);
		currAccount.withdraw(200000);
		currAccount.display();
		
	}

}
