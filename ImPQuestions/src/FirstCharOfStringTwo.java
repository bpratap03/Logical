public class FirstCharOfStringTwo {
	public static void main(String[] args) {
		String name = "Bhanu Pratap";
		String[] s = name.split(" ");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i].charAt(0));

		}
	}
}