package Overloading;

public class TypePromtion1 {
	public void m1(double xyz,long abc)
	{
		System.out.println("double, long");
	}
	public void m1(long abc,double xyz)
	{
		System.out.println("long, double");
	}
}
