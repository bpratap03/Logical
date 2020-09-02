package Constructor;

class Parent {

	String s = "parent variable";
}

class Child extends Parent {

	String s = "child variable";

	public void m1() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);// parent variable print.

	}

}

class SuperAndThisKryword {
	public static void main(String[] args) {
		Child c = new Child();
		c.m1();

	}
}
