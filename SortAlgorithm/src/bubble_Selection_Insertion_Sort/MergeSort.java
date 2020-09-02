package bubble_Selection_Insertion_Sort;

import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] arr) {
		int len = arr.length;
		if (len == 1)
			return;
		int mid = len / 2;
		int[] left = new int[mid];
		int[] right = new int[len - mid];
		for (int i = 0; i < mid; i++) {
			left[i] = arr[i];

		}
		for (int i = mid; i < len; i++) {
			right[i - mid] = arr[i];

		}
		mergeSort(left);
		System.out.println(Arrays.toString(left));

		mergeSort(right);
		System.out.println(Arrays.toString(right));

		MergeTwoSortedArray.merge(arr, left, right);

	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 2, 7, 4, 13, 9, 15, 6 };
		mergeSort(arr);
	}

}
