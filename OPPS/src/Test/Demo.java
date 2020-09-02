package Test;

public class Demo {

	public static void main(String[] args) {
		User u =new User();
		System.out.println(u);
		//Employee e= (Employee)u;
		Employee e= new Employee() ;
		User u1=(User)e;
		System.out.println(u1);
		

	}

}
