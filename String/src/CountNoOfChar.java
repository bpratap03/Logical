import java.util.HashMap;
import java.util.Map;

public class CountNoOfChar {
	public static void charCount(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
		}

	}

	public static void main(String[] args) {
		String s = "abaacebdaffffffff";
		charCount(s);

	}

}
