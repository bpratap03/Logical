//using loop
public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 8, 8 };
		int[] arr1 = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr1[j] = arr[i];
				j++;
			}
		}
		arr1[j] = arr[arr.length - 1];
		for (int x : arr1) {
			System.out.print(x + " ");
		}
	}

}
