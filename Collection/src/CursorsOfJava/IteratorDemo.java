package CursorsOfJava;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IteratorDemo {

	public static void main(String[] args) {
		Collection <Integer> c= new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add(30);
		c.add(40);
		System.out.println(c.add(50));
		System.out.println(c);
		
		Iterator<Integer> itr= c.iterator();
		while(itr.hasNext())
		{
			Integer i=itr.next();
			System.out.println(i);
			
			
		}
		itr.remove();
		System.out.println(c);
	}

}
