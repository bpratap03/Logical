package bubble_Selection_Insertion_Sort;

import java.util.Arrays;

public class MergeTwoSortedArray {

	public static void merge(int[] mergedArray, int[] arr1, int[] arr2) {
		int arr1_length = arr1.length;
		int arr2_length = arr2.length;
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < arr1_length && j < arr2_length) {
			if (arr1[i] <= arr2[j]) {
				mergedArray[k] = arr1[i];
				i++;
				k++;
			} else {
				mergedArray[k] = arr2[j];
				j++;
				k++;

			}
		}
			while (i < arr1_length) {
				mergedArray[k] = arr1[i];
				i++;
				k++;
			}
			while (j < arr2_length) {
				mergedArray[k] = arr2[j];
				j++;
				k++;
			}

		
		System.out.println(Arrays.toString(mergedArray));

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7, 9, 11, 13, 15 };
		int[] arr2 = { 2, 4, 6, 8, 10, 12, 14, 16 };
		int arr1_length = arr1.length;
		int arr2_length = arr2.length;
		int[] mergedArray = new int[arr1_length + arr2_length];
		merge(mergedArray, arr1, arr2);

	}

}
