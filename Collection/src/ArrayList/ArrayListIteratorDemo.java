package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;


import CustomClasses.Customer;

public class ArrayListIteratorDemo {

	public static void main(String[] args) throws InterruptedException {
		Customer c0 = new Customer("ram", "r");
		Customer c1 = new Customer("aram", "ra");
		Customer c2 = new Customer("bram", "rb");
		Customer c3 = new Customer("cram", "rc");
		Customer c4 = new Customer("dram", "rd");
		ArrayList<Customer> al = new ArrayList<>();
		al.add(c0);
		al.add(c1);
		al.add(c2);
		al.add(c3);
		al.add(c4);
		System.out.println(al);

		Iterator<Customer> it = al.iterator();

		while (it.hasNext()) {
			Customer c = it.next();
			if (c.id.equals("ra")) {
				it.remove();
			} else {
				System.out.println(c);
				Thread.sleep(2000);
			}

		}
		System.out.println(al);
		
	}

}
