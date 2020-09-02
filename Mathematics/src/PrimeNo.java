
public class PrimeNo {

	public static boolean isPrime(int x) {
		int flag = 0;
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n=123;
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i);
			}
		}

	}

}
