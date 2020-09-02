import java.util.HashMap;
import java.util.Map;

public class FindDuplicatefromArray {

	public static void main(String[] args) {
		int[] arr = { 10, 10, 11, 1, 2, 8, 3, 4, 9, 5, 5, 6, 1, 7, 7, 8, 8, 9 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int x : arr) {
			if (hm.containsKey(x)) {
				hm.put(x, hm.get(x) + 1);
			} else {
				hm.put(x, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if (entry.getValue() >= 2) {
				System.out.print(entry.getKey() + " ");
			}

		}

	}

}
