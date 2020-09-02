
public class NthRootOfM {

	static double root(double m, double n) {
		return Math.pow(m, 1 / n);
	}

	public static void main(String[] args) {
		int x = (int) root(9, 2);
		System.out.println(x);

	}

}
