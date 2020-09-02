
public class PowerFonction {
	static int power(int a, int b) {
		if (b == 0) {
			return 1;
		} else {
			return a * power(a, b - 1);
		}

	}

	static int powerx(int a, int b) {
		if (b == 0)
			return 1;
		int temp = powerx(a, b / 2);
		temp = temp * temp;
		if (b % 2 == 0) {
			return temp;
		} else {
			return temp * a;
		}
	}

	public static void main(String[] args) {
		int x = power(3, 4);
		int y=powerx(3,4);
		System.out.println(x);
		System.out.println(y);

	}

}
