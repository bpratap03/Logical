
public class NoPalindrome {
	
	public static void palindrome(int n)
	{
		int temp=n;
		int reverse=0;
		while(temp!=0)
		{
			int x=temp%10;
			reverse=reverse*10+x;
			temp=temp/10;
		}
		System.out.println(reverse);
		if(n==reverse)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

	public static void main(String[] args) {
		
		palindrome(123);

	}

}
