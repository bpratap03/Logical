
public class FirsrLastCharOfString {

	public static void main(String[] args) {
		String s="bhanu cratap thakur anurag baba";
		String[] s1=s.split(" ");	
		
		for(int i=0;i<s1.length;i++)
		{
			if(i%2==0)
			{
				System.out.println(s1[i].charAt(0));
			}
			else if(i%2!=0)
			{
				System.out.println(s1[i].charAt(s1[i].length()-1));
			}
			
		}
	}
}