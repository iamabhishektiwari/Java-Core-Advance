package com.abhishek.func;

public class CurrentAccount extends Account{
	private float neglimit;

	public float getNeglimit() {
		return neglimit;
	}

	public void setNeglimit(float neglimit) {
		this.neglimit = neglimit;
	}

	public CurrentAccount(int accno, String name, float bal, float neglimit) {
		super(accno, name, bal);
		this.neglimit = neglimit;
	}

	public CurrentAccount() {
		super();
	}
	
	public void display() {
		super.display();
		System.out.println("Negative limit is: "+neglimit);
	}
	public void withdraw(float amt) {
		if(super.getBal()-amt > neglimit)
			super.withdraw(amt);
		else
			System.out.println("limit exceeded");
	}
}
