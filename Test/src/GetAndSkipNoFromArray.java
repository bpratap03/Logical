
public class GetAndSkipNoFromArray {
	public static void mgetSix(int[]a,int x)
	{
		int count=1;
		while(count<=x)
		{
			if(count==x)
			{
				System.out.println(a[x]);
				break;
			}
			count++;
		}
	}
	public static void skipNo(int[]a,int x)
	{
		int []b=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==x)
			{
				continue;
			}
			b[i]=a[i];
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int [] a= new int[10];
		for(int i=0;i<10;i++)
		{
			a[i]=i*4;
		}
		for(int i=0;i<10;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		mgetSix(a,6);
		System.out.println(" ");
		skipNo(a,16);

	}

}
