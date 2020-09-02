
public class CountOfSpecificChar {

	public static void main(String[] args) {
		String name = "My Name Is bhanu Pratap";
		char c = 'a';
		String d = "Pratap";
		String[] s = name.split(" ");
		int count = 0;
		int count1 = 0;
		for (int i = 0; i < s.length; i++) {
			String word = s[i];
			if (!s[i].equals(d)) {
				count = count + word.length() + 1;
			} else {
				for (int j = 0; j < word.length(); j++) {
					if (word.charAt(j) == c) {
						break;
					}
					count1++;
				}
				break;
			}

		}

		System.out.println(count + count1);

	}
}
