
public class GCDorHCF {
	public static int hcf(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		return hcf(b,a%b);
	}

	public static void main(String[] args) {
		int x =hcf(10,15);
		System.out.println(x);

	}

}
