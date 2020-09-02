import java.util.HashSet;

public class RemoveDulicateUsingSet {

	public static void main(String[] args) {
		int[] arr = { 10, 11, 1, 2, 8, 3, 4, 9, 5, 5, 6, 1, 7, 7, 8, 8, 9 };
		HashSet<Integer> hs = new HashSet<>();
		for (int x : arr) {
			hs.add(x);
		}
		System.out.println(hs);
	}

}
