package oops_2;

public class Address {

	private String line1;
	private String city;
	private String pincode;

	public Address(String line1, String city, String pincode) {
		super();
		this.line1 = line1;
		this.city = city;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
