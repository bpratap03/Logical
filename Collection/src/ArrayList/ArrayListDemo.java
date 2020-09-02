package ArrayList;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		ArrayList<String> al2 = new ArrayList<String>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add('a');
		al.add('b');
		al.add('c');
		al.add('d');
		al.add('e');
		al.add('f');
		al.add("bhanu");
		al.add("anu");
		al2.add("bhanu");
		al2.add("anu");
		al.add(2,null);

		System.out.println(al);
		al.remove(new Integer(10));
		// System.out.println(al.add(25));
		al.remove(2);
		System.out.println(al);
		//al.retainAll(al2);
		System.out.println(al);
		al2.add("ram");
		System.out.println(al2);
		//al.retainAll(al2);
		System.out.println(al);
		al.addAll(al2);
		System.out.println(al+"--->");
	List<String> l=Collections.synchronizedList(al2);
	System.out.println(l);
		

	}

}
