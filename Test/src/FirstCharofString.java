
public class FirstCharofString {

	public static void m1(String name) {
		char[] ch = name.toCharArray();
		System.out.println(ch[0]);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ') {
				System.out.println(ch[i + 1]);

			}
		}
	}

	public static void main(String[] args) {

		String name = "Bhanu Pratap thakur hgjdsg bbbd";
		m1(name);
	}
}
