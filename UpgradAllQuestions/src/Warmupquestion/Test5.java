package Warmupquestion;

public class Test5 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 2, 4 };
		int[] b = new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = a[a.length - 1 - i];
			System.out.print(b[i] + " ");
		}
		System.out.println(" ");
		int[] z = { 1, 3, 5, 7, 2, 4 };
		int x = 0;
		int y = z.length - 1;
		while (x < y) {
			z[x] = z[x] + z[y];
			z[y] = z[x] - z[y];
			z[x] = z[x] - z[y];
			x++;
			y--;

		}
		for (int j = 0; j < z.length; j++) {

			System.out.print(z[j] + " ");
		}

	}

}
