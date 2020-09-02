import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class LoveCoding {

	public static void main(String[] args) {
		User u = new User(10, "ram");
		User u1 = new User(70, "shyam");
		User u2 = new User(30, "ghanshyam");
		User u3 = new User(47, "manshaym");

		Employee e = new Employee("ram", 5);
		Employee e1 = new Employee("aram", 225);
		Employee e2 = new Employee("bram", 15);
		Employee e3 = new Employee("cram", 125);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(e);
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		System.out.println(employeeList);

		TreeSet<Employee> employeeSet = new TreeSet<Employee>();
		employeeSet.add(e);
		employeeSet.add(e1);
		employeeSet.add(e2);
		employeeSet.add(e3);
		System.out.println(employeeSet);

		ArrayList<Integer> arls = new ArrayList<Integer>();
		arls.add(25);
		arls.add(50);
		arls.add(75);
		arls.add(12);
		arls.add(10);
		System.out.println(arls);
		Collections.sort(arls);
		System.out.println(arls);

	}

}
