package SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Object> lhs= new LinkedHashSet<>();
		lhs.add(10);
		lhs.add("ram");
		lhs.add('a');
		lhs.add(50);
		lhs.add(30);
		lhs.add(null);
		System.out.println(lhs.add(10));
		System.out.println(lhs);

	}

}
