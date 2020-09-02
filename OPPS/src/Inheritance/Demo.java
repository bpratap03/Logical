package Inheritance;

public class Demo {

	public static void main(String[] args) {
		Bank b = new Bank();
		Bank b1 = new Sbibank();
		Bank b2 = new HDFC();
		Sbibank s1 = new Sbibank();
		// Sbibank s2= new Bank(); child can not hold parent obj.
		// Sbibank s3= new HDFC(); no relation between sbi and hdfc
		HDFC h = new HDFC();

		s1.getBankName();
		s1.getBankAddress();
		b1.getBankAddress();
		b.getBankAddress();
		b2.getBankAddress();
		h.getBankName();
		h.getBankAddress();

		Parent p = new Parent();
		p.parentMethod();
		// p.childMethod(); -parent can not access child specific methods.

		Parent p1 = new Child();
		p1.parentMethod();
		// p1.childMethod(); -- parent referance can hold child obj but only access
		// parent methods not child methods.

		Child c = new Child();
		c.parentMethod();
		c.childMethod(); // - by default all parent method is available for child

		// Child c1= new Parent(); -- Child can not hold parent obj.

	}

}
