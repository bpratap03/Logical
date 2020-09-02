package StaticControlFlow;

public class Student {
	static String schoolName;
	static String address;
	String name;
	int id;
	
	static {
		schoolName = "DPS";
		System.out.println("static");
	}

	public Student(String name, int id) {
		this.name = name;
		this.id = id;
		System.out.println("costructur");
		
	}
	
	static {
		address = "Delhi";
	}


	public void show() {
		System.out.println(name + "-->" + id + "-->" + schoolName + "-->" + address);
	}

	public static void main(String[] args) {

		Student s = new Student("Bhanu", 1);
		Student s1 = new Student("Anu", 2);
		s.show();
		s1.show();
	}

}
