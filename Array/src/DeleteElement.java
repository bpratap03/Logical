import java.util.Arrays;

public class DeleteElement {

	public static void main(String[] args) {
		int [] a= {3,6,4,9,6,1};
		int z=9;
		for(int i=0;i<a.length;i++) {
			if(a[i]==z)
			{
				for(int j=i; j<a.length-1;j++) {
					a[j]=a[j+1];
				}
				a[a.length-1]=0;
			}
			
		}
		
		
		System.out.println(Arrays.toString(a));

	}

}
