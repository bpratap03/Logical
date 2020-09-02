import java.util.*;

class DuplicateBoardingPass {
	public static void main(String[] args) {
		Hashtable<Integer, String> boardingPass = new Hashtable<Integer, String>();
		int arr[] = { 3, 9, 34, 1, 3 };
		for (int i : arr) {
			// Check whether the pass already exists in the hash table or not. If it
			// doesn’t, add it to the table; otherwise, print the duplicate pass number.
			if (boardingPass.containsKey(i)) {
				boardingPass.put(i, "0");
			} else {
				boardingPass.put(i, "1");
			}
		}
		for (int j : arr) {
			if (boardingPass.get(j).equals("0")) {
				System.out.println(j);
				break;
			}
		}
	}
}
