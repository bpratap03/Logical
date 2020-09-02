import java.util.Arrays;

public class MaxMinInArray {

	public static void main(String[] args) {
		int [] a= {3,6,4,9,6,1};
		Arrays.sort(a);
		System.out.println(a[a.length-1]+" "+a[0]);

	}

}
