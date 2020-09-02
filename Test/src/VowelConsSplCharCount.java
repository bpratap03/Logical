
public class VowelConsSplCharCount {
	public static void m1(String s)
	{
		int consCount =0;
		int vowCount =0;
		int intCount =0;
		int spaceCount =0;
		
	
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'
					|| s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				vowCount+=1;
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				intCount+=1;
			}
			else if(s.charAt(i)==' ')
			{
				spaceCount+=1;
			}
			else
			{
				consCount+=1;
			}
		}
		System.out.println(consCount);
		System.out.println(vowCount);
		System.out.println(intCount);
		System.out.println(spaceCount);
		
	}
	
	public static void main(String[]args)
	{
		String s= "bhanu 2345 abcigtklt";
		m1(s);
	}

}
