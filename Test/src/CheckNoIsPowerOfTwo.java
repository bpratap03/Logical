
public class CheckNoIsPowerOfTwo {

	public static void main(String[] args) {
		double n = 16;
		int m = 27;
		while (n > 1) {
			if (n % 2 != 0) {
				System.out.println("false");
				return;
			}
			n = n / 2;
		}
		System.out.println("true");

// check power of three//

		while (m > 1) {
			if (m % 3 != 0) {
				System.out.println("false");
				return;
			}
			m = m / 3;
		}
		System.out.println("true");
	}
}
