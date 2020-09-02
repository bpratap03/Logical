
public class NoOfDigit {

	static void pattern(int n) {

		for (int i = n; i > 0; i--) {
			for (int j = n; j > 0; j--) {
				for (int k = 1; k <= i; k++) {
					System.out.print(j);
				}
				
			}
			System.out.println("");
		}

	}

	public static void main(String[] args) {
		int n = 3;
		pattern(n);

	}

}
