package StackImplementationUsingArray;

public class Demo {
	public static void main(String[] args) {
		Stack st = new Stack(5);
		System.out.println(st.peek());
		st.push(1);
		st.push(2);
		st.push(3);
		System.out.println(st.isEmpty());
		System.out.println(st.peek());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.isEmpty());

	}

}
