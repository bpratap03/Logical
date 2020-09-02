package Array;

import java.util.Arrays;

public class ArrayList1 {

	public static int[] arr;

	public ArrayList1(int size) {
		arr = new int[size];
	}

	public void add() {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 2;
		}

	}

	public static void main(String[] args) {
		ArrayList1 al = new ArrayList1(10);
		al.add();
		System.out.println(Arrays.toString(arr));
	}
}
