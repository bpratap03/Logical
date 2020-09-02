// HCF
package Warmupquestion;

public class Test3 {
	public static void main(String[] args) {
		int a = 12;//45,12,9,3
		int b = 45;//12,9,3,0
		int hcf = 0;//45,12,9,3
		while(b>0) {
			hcf=b;
			b=a%b;
			a=hcf;	
		}
		System.out.println(hcf);
	}
}
