package Abstraction;
public class Demo {
	public static void main(String[] args) {
		SbiAtm sb = new SbiAtm();
		Atm a = new SbiAtm();
		System.out.println(a.withrawMoney());
		sb.dispalybalance();

	}

}
