package HasArelation;

import java.util.Arrays;

public class Userdetails {

	private String name;
	private int pnoneNo;
	private String email;
	Address billingAddress;
	Address[] shiping;

	public Userdetails(String name, int pnoneNo, String email, Address billingAddress, Address[] shiping) {
		super();
		this.name = name;
		this.pnoneNo = pnoneNo;
		this.email = email;
		this.billingAddress = billingAddress;
		this.shiping = shiping;
	}

	@Override
	public String toString() {
		return "Userdetails [name=" + name + ", pnoneNo=" + pnoneNo + ", email=" + email + ", billingAddress="
				+ billingAddress + ", shiping=" + Arrays.toString(shiping) + "]";
	}

}
