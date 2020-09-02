package Warmupquestion;

public class Test7 {
	public static void main(String[]args) {
		int sum=0;
		double mean=0.0;
		int start=0;
		double median=0;
		int [] a= {1, 3, 4, 2, 6, 5, 8, 7};
		int end=a.length-1;
		
		
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
			
		}
		System.out.println(sum);
		mean=sum/(double)a.length;
		System.out.println(mean);
		median= (start+end)/2;
		System.out.println(median);

	}
	
}
