import java.util.HashMap;
import java.util.Map;

public class IterationMapEntry {

	public static void main(String[] args) throws InterruptedException {
		String s = "bhanuu pratap";
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}

		}

		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (entry.getValue() == 2) {
				continue;
			} else {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
				

			}

		}
	}
}
