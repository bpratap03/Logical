//HCF
package Warmupquestion;

public class Test2 {

	public static void main(String[] args) {
		int a = 12;
		int b = 45;
		while (a!= b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		System.out.println(a);
	}
}

