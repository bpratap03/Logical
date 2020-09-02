//clockwise
public class LeftShift {
	public static void main(String[] args) {
		int[] arr = { 3, 7, 4, 9, 6, 1, 45 };
		int m = arr.length - 1;
		int n = 2;
		int i = 0;
		int b_point=n-1;
		while(i<b_point)
		{
			arr[i] = arr[i] + arr[b_point];
			arr[b_point] = arr[i] - arr[b_point];
			arr[i] = arr[i] - arr[b_point];
			i++;
			b_point--;
		}
	    i = 0;
		while(n<m)
		{
			arr[n] = arr[n] + arr[m];
			arr[m] = arr[n] - arr[m];
			arr[n] = arr[n] - arr[m];
			n++;
			m--;
		}
		m=arr.length - 1;
		while(i<m)
		{
			arr[i] = arr[i] + arr[m];
			arr[m] = arr[i] -arr[m];
			arr[i] = arr[i] - arr[m];
			i++;
			m--;
		}
		for(int x :arr)
		{
			System.out.print(x+" ");
		}
	}

}
