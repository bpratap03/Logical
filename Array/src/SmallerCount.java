//smaller count for a given no
public class SmallerCount {

	public static void main(String[] args) {
		int[] arr = { 3, 7, 4, 9, 6, 1, 45, 10};
		int no=9;
		int smalleCount=0;
		int largerCount=0;
		for(int x :arr)
		{
			if(x<no)
			{
				smalleCount++;
			}
			else if(x>no)
			{
				largerCount++;
			}
		}
		System.out.println(smalleCount+" "+largerCount);
	}

}
