
public class PerfectNumber {

	static boolean perfectNo(int n) {

		int res = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				res = res + i;
			}
		}
		if (res == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(perfectNo(6));
	}

}
