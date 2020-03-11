package ykb.com.ykb.java.project.customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerManager {
	private Map<String, Customer> customerMap = new HashMap<>();

	public CustomerManager(final EReaderType readerType) {
		ICustomerReader createCustomerReader = CustomerReaderFactory.createCustomerReader(readerType);
		List<Customer> customers = createCustomerReader.getCustomers();
		for (Customer customer : customers) {
			this.customerMap.put(customer.getUsername(), customer);
		}
	}

	public Customer getCustomer(final String string) {
		return this.customerMap.get(string);
	}

	public Customer addCustomer(final String username, final Customer customer) {
		return this.customerMap.put(username, customer);
	}

}
