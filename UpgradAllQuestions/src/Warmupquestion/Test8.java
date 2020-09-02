package Warmupquestion;

public class Test8 {
	static int gcd(int a, int b) 
    { 
		if (a==0){
			return b;		}
    while(a!=b) 
    {
    	if(a>b)
    	{
    		a=a-b;
    	}
    	else
    	{
    		b=b-a;
    	}
    }
    return a;
    } 
      
    // method to return LCM of two numbers 
    static void lcm(int a, int b) 
    { 
    	if(a>1000 || b>1000)
    	{
    		System.out.println("out of range");
    	}
    	else {
    			System.out.println((a*b)/gcd(a, b));
    	}
    } 

	public static void main(String[] args) {
		
		 int a = 10000, b = 5;  
		lcm(a,b);

	}

}
