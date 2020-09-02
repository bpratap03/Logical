
public class LargestPrimefFactor {

	public static boolean isPrime(int x) {
		int flag = 0;
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void largestPrimeFactor(int n) {
		int max = 0;
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.println(i);
					x = i * x;
					if (max < x) {
						max = i;

					}
				}
			}
		}
		System.out.println(max);

	}

	public static void main(String[] args) {

		largestPrimeFactor(50);
	}

}
