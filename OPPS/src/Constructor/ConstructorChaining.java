package Constructor;
class Parent2 {
	Parent2() {
		this(10);
		System.out.println("no arg constructor ");
	}

	Parent2(int i) {
		this(10, "bhanu");
		System.out.println("1-param constructor");
	}

	Parent2(int i, String s) {
		System.out.println("2-param constructor");
	}
}

public class ConstructorChaining {

	public static void main(String[] args) {
		new Parent2();
		System.out.println("main method call");

	}

}
