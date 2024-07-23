package oops_2;

public class customerRunner {

	public static void main(String[] args) {

		Address homeAddress = new Address("line 100", "Chennai", "600212");
		customer cust = new customer("Dinga", homeAddress);
		System.out.println(cust);
	}

}
