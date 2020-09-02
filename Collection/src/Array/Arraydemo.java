package Array;

import java.util.Arrays;

import CustomClasses.Customer;
import CustomClasses.Employe;

public class Arraydemo {

	public static void main(String[] args) {
		Object[] arr = new Object[2];
		Customer c = new Customer("Customer");
		Employe e = new Employe("Employe");
		arr[0] = c;
		arr[1] = e;
		System.out.println(Arrays.toString(arr));

	}

}
