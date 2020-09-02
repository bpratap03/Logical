
public class BinaryToDecimal {
	static int power(int a, int b) {
		if (b == 0) {
			return 1;
		} else {
			return a * power(a, b - 1);
		}

	}

	public static int binryToDecimal(int n) {
		int temp = n;
		int counter = -1;
		int power = 0;
		int res = 0;
		while (temp != 0) {
			counter++;
			int x = temp % 10;
			if (x != 0) {
				power = power(2, counter);
			}
			res = res + power;
			power = 0;
			temp = temp / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		int x = binryToDecimal(1101);
		System.out.println(x);

	}

}
