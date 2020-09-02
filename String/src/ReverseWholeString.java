
public class ReverseWholeString {
	public static void reverseWhole(String s) { // o/p- ji hgfe dcba
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void reverseWordInPlace(String s) { // o/p- dcba hgfe ji
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			reverseWhole(" " + s1[i]);
		}
	}

	public static void reverseWordorder(String s) // o/p- ij efgh abcd
	{
		String[] s2 = s.split(" ");
		for (int i = s2.length - 1; i >= 0; i--) {
			System.out.print(s2[i] + " ");
		}
	}

	public static void main(String[] args) {
		String s = "Ram Is a boy";
		reverseWhole(s);
		System.out.println("");
		reverseWordInPlace(s);
		System.out.println("");
		reverseWordorder(s);

	}

}
