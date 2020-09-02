package SetDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Object> hs= new HashSet<> ();
		hs.add(10);
		hs.add("ram");
		hs.add('a');
		hs.add(50);
		hs.add(30);
		hs.add(null);
		System.out.println(hs.add(10));
		System.out.println(hs);

	}

}
