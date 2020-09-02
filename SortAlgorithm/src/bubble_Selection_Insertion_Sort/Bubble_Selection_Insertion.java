package bubble_Selection_Insertion_Sort;

import java.util.Arrays;

public class Bubble_Selection_Insertion {

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					arr[j] = arr[j] + arr[j + 1];
					arr[j + 1] = arr[j] - arr[j + 1];
					arr[j] = arr[j] - arr[j + 1];

				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

	public static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}

			if (min != i) {
				arr[i] = arr[i] + arr[min];
				arr[min] = arr[i] - arr[min];
				arr[i] = arr[i] - arr[min];
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	public static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {

			int pivot = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > pivot) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = pivot;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {

		int[] arr = { 20, 3, 12, 1, 9, 2, 8, 15, 7 };
		bubbleSort(arr);
		selectionSort(arr);
		insertionSort(arr);
	}

}
