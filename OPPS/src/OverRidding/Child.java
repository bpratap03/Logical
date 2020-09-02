package OverRidding;

public class Child extends Parrent {

	// protected not allowed//
	public void marry() {
		System.out.println("marry with gf ");
	}

	public void car() {
		System.out.println("my own car");
	}
	public static void land() { // Non static Mehod not allwed
		System.out.println("parrent Land + Child Land");
	}
}
