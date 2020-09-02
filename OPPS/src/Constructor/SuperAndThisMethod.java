package Constructor;

class Parent1 {
	Parent1() {

		System.out.println("parent constructor");
	}
}

class Child1 extends Parent1 {
	Child1() {
		super();
		System.out.println("Child constructor");
	}
}

public class SuperAndThisMethod {
	public static void main(String[] args) {
		new Child1();
		System.out.println("main method call");
		

	}

}
