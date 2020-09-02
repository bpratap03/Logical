
public class linearSerch {

	public static int linearSearch(int[] arr, int key) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return arr[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 20, 3, 12, 1, 9, 2, 8, 15, 7 };
		int key = 1;
		int x = linearSearch(arr, key);
		System.out.println(x);

	}

}
