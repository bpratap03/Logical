package CursorsOfJava;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("ram");
		v.add("bram");
		v.add("cram");
		v.add("dram");
		v.add("eram");
		v.add("fram");
		v.add("shyam");

		System.out.println(v);

		Enumeration<String> e = v.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println(stack);
		int x=stack.peek();
		System.out.println(x); 
		
		Enumeration<Integer> e1 = stack.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}

	}

}
