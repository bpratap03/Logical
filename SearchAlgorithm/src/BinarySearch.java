
public class BinarySearch {
	public static int binarySearch(int[] arr, int key) {
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			int mid = (l + r) / 2;
			if (arr[mid] == key) {
				return (arr[mid]);

			}
			if (arr[mid] < key) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 9, 12, 15, 18, 20 };
		int key = 19;
		int x = binarySearch(arr, key);
		System.out.println(x);

	}

}
