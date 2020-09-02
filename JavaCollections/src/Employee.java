
public class Employee implements Comparable<Employee> {

	String name;
	int hight;

	Employee() {

	}

	public Employee(String name, int hight) {
		super();
		this.name = name;
		this.hight = hight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", hight=" + hight + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if (this.name.charAt(0)<e.name.charAt(0)) {
			return -1;

		} else if (this.name.charAt(0)>e.name.charAt(0)) {
			return +1;
		}
		return 0;
	}

}
