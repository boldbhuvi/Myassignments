package org.bank;

public class Axisbank extends Bankinfo{
	
	public void deposit()
	{
	System.out.println("Deposit1 amount");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Axisbank access=new Axisbank();
		access.saving();
		access.fixed();
		System.out.println("The mothod override");
		access.deposit();

	}

}
