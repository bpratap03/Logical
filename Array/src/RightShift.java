//AntiClock
public class RightShift {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 4, 9, 6, 1, 45 };
		int m = arr.length - 1;
		int n = 2;
		int i = 0;
		int b_point = m - n;
		while (i < b_point) {
			arr[i] = arr[i] + arr[b_point];
			arr[b_point] = arr[i] - arr[b_point];
			arr[i] = arr[i] - arr[b_point];
			i++;
			b_point--;
		}
		i = 0;
		b_point = m - n;
		int nextPoint = b_point + 1;
		while (nextPoint < m) {
			arr[nextPoint] = arr[nextPoint] + arr[m];
			arr[m] = arr[nextPoint] - arr[m];
			arr[nextPoint] = arr[nextPoint] - arr[m];
			nextPoint++;
			m--;
		}
		m = arr.length - 1;

		while (i < m) {
			arr[i] = arr[i] + arr[m];
			arr[m] = arr[i] - arr[m];
			arr[i] = arr[i] - arr[m];
			i++;
			m--;
		}

		for (int x : arr) {
			System.out.print(x + " ");
		}

	}
}
