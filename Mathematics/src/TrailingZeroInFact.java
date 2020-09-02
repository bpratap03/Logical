
public class TrailingZeroInFact {

	public static int trailingZero(int x) {
		int res = 0;
		for (int i = 5; i <= x; i = i * 5) {
			res = res + x / i;
		}
		return res;

	}

	public static void main(String[] args) {

		System.out.println(trailingZero(11));

	}

}
