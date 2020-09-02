package bubble_Selection_Insertion_Sort;

import java.util.Arrays;

public class QuickSort {

	public static int partion(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pindex = 0;
		for (int i = 0; i < end; i++) {
			if (arr[i] <= pivot) {
				int temp = arr[i];
				arr[i] = arr[pindex];
				arr[pindex] = temp;
				pindex++;
			}
		}
		int temp = arr[pindex];
		arr[pindex] = arr[end];
		arr[end] = temp;
		return pindex;
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start >= end) {
			return;
		} else {
			int x = partion(arr, start, end);
			quickSort(arr, start, x - 1);
			quickSort(arr, x + 1, end);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 5, 2, 35, 44, 1, 7, 3, 96, 2, 7, 7, 6, 9, 8, 4 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

}
