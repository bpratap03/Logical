import java.util.HashSet;

import CustomClasses.Customer;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs =new HashSet<String>();
		hs.add("ram");
		System.out.println(hs.add("ram"));
		hs.add("aram");
		hs.add("bram");
		hs.add("cram");
		System.out.println(hs);
		Customer c0 = new Customer("ram", "r");
		Customer c1 = new Customer("ram", "r");
		Customer c2 = new Customer("bram", "rb");
		Customer c3 = new Customer("cram", "rc");
		Customer c4 = new Customer("dram", "rd");
		HashSet<Customer> hs1 =new HashSet<Customer>();
		hs1.add(c0);
		hs1.add(c1);
		hs1.add(c2);
		hs1.add(c3);
		hs1.add(c4);
		System.out.println(hs1);
		

	}

}
