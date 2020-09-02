//print hundred,tense and once place digit
package Warmupquestion;

public class Test1 {
	public static void main(String[] args) {
		int a = 347;
		int x = a % 10;
		int y = (a / 10) % 10;
		int z = (a / 100) % 10;

		System.out.println(z + "\n" + y + "\n" + x);

	}
}
