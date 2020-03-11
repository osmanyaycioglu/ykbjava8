package ykb.com.ykb.java.project.customer;

public class CustomerMain {
	public static void main(final String[] args) {
		CustomerManager customerManager = new CustomerManager(EReaderType.MANUAL);
		Customer customer = customerManager.getCustomer("osmany");
		System.out.println(customer);
	}
}
