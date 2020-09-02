package HasArelation;

public class Demo {

	public static void main(String[] args) {
		Address ad= new Address("xyz","bangalore");
		Address ad1= new Address("fgh","pune");
		Address ad2= new Address("mjk","mfp");
		Address[] ad3= new Address[2];
		ad3[0]=ad1;
		ad3[1]=ad2;
		
		Userdetails ud =new Userdetails("bhanu",12334,"bhappapa",ad,ad3);
		System.out.println(ud);
		
		
		
		Engine e=new Engine();
		Car c=new Car();
		c.run(e);
	}

}
 