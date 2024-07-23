package oops_2;

public class customer {

	private String name;
	private Address homeaddress;// object composition
	private Address workaddress;

	public customer(String name, Address homeaddress) {
		this.name = name;
		this.homeaddress = homeaddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(Address homeaddress) {
		this.homeaddress = homeaddress;
	}

	public Address getWorkaddress() {
		return workaddress;
	}

	public void setWorkaddress(Address workaddress) {
		this.workaddress = workaddress;
	}

	@Override
	public String toString() {
		return "customer [name=" + name + ", homeaddress=" + homeaddress + ", workaddress=" + workaddress + "]";
		// return String.format("name - [%s] home address - [%s] work address - [%s]",
		// name,homeaddress,workaddress);
	}

}
