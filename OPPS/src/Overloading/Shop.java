package Overloading;

public class Shop {

	public void doWork(String name, String work) {
		System.out.println(name+work);
	}
	
	public void  doWork(String name, String work,int priority)
	{
		System.out.println(name+work+priority);
	}
}
