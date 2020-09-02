package Overloading;

import Inheritance.Bank;
import Inheritance.HDFC;
import Inheritance.Sbibank;

public class OverLoadingConcept4 {
	
	public void m1(Bank b)
	{
		System.out.println("bank");
	}
	public void m1(Sbibank sb)
	{
		System.out.println("SBI bank");
	}
	

}
