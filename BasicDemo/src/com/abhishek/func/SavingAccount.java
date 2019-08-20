package com.abhishek.func;

public class SavingAccount extends Account{
	private float minbal;

	public float getMinbal() {
		return minbal;
	}

	public void setMinbal(float minbal) {
		this.minbal = minbal;
	}

	public SavingAccount(int accno, String name, float bal, float minbal) {
		super(accno, name, bal);
		this.minbal = minbal;
	}

	public SavingAccount() {
		super();
	}
	
	public void display() {
		super.display();
		System.out.println("Minimum balance is: "+minbal);
	}
	public void withdraw(float amt){
		if(super.getBal()-amt >= minbal)
			super.withdraw(amt);
		else
			System.out.println("Amount less than min balance");
	}

}
