
public class Example1 {
	public static void fun1(int x) {
		if (x == 0) {
			return;
		} else {
			System.out.println("ABC");
			fun1(x - 1);
		}
	}

	public static void main(String[] args) {
		fun1(2);
	}
}
