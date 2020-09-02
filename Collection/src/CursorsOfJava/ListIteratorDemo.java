package CursorsOfJava;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class ListIteratorDemo {

	public static void main(String[] args) {

		Stack <Integer> stack = new Stack<>();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		

		System.out.println(stack);

		ListIterator<Integer> ltr = stack.listIterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());

		}
		System.out.println(ltr.previous());
		System.out.println(ltr.nextIndex());
		
		System.out.println(stack);
		ltr.add(100);
		System.out.println(stack);

	}

}
