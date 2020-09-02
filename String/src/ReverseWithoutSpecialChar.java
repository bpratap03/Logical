
public class ReverseWithoutSpecialChar {
	public static void reverse(char[] c) {
		int l = 0;
		int r = c.length - 1;
		char temp;
		while (l < r) {
			if (!Character.isAlphabetic(c[l])) {
				l++;
			} else if (!Character.isAlphabetic(c[r])) {
				r--;
			} else {
				temp = c[l];
				c[l] = c[r];
				c[r] = temp;
				l++;
				r--;
			}
		}

		System.out.print(c);
	}

	public static void main(String[] args) {
		String s = "a@bc%dEf g&*jk";
		char[] c = s.toCharArray();
		reverse(c); // O/P- k@jg%fEd c&*ba
	}

}
