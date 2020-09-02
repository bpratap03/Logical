package Encapsulation;
//binding data with methods. access the variable with the methods. data is save.use private modifier
public class Incapsulation {

	private int balance;

	public void setBalance(int x) {
		this.balance = x;
	}

	public int getBalance() {
		return balance;
	}

	public static void main(String[] args) {
		Incapsulation ip = new Incapsulation();
		ip.setBalance(10);
		System.out.println(ip.getBalance());

	}
}
