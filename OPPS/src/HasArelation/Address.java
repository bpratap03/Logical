package HasArelation;

public class Address {

	String address;
	String street;
	@Override
	public String toString() {
		return "Address [address=" + address + ", street=" + street + "]";
	}
	
	Address(String address,String street){
		this.address=address;
		this.street=street;
	}
}
