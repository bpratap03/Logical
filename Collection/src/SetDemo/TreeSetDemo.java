package SetDemo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		SortedSet<Object> s= new TreeSet<Object>();
		s.add(1);
		s.add(10);
		s.add(4);
		s.add(450);
		s.add(4);
		
		
		//s.add(null);
		s.add("bhanu");  //Heterogeneous object is not allowed
		System.out.println(s.comparator());   //null
		
		
		System.out.println(s); //[1, 4, 10, 450] default sorting order is ascending. Duplicates are not allowed.
	}

}
