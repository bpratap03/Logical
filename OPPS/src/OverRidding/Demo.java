package OverRidding;

public class Demo {

	public static void main(String[] args) {
		Parrent p = new Parrent();
		
		p.money();// parent class method exicute.
		p.marry();
		p.land();
	//p.car();  child specific method
		
	
		Child c =new Child();
		c.money();// parent class method
		c.marry();// child class method
		c.land();
		
		Parrent p1= new Child();
		p1.money();     // money and marry is p1 (parent) type. Compiler check money and is available in parent (yes)
		p1.marry();     // code compiles fine but at run time JVM check on which object money and marry method call.
		                // On child object money an marry method call and child override both the method so at runtime  
		                // method resolution is happening so runtime polymorphism.
	   
		
		//Child c1= new Parrent(); cant hold parrent obj.

	}

}
