package ykb.com.ykb.java.project.customer;

import java.util.ArrayList;
import java.util.List;

public class ManualCustomerReader implements ICustomerReader {

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setName("osman");
		customer.setSurname("yaycioglu");
		customer.setUsername("osmany");
		customer.setPassword("1234");
		Account account = new Account();
		account.setAccountType(EAccountType.TL);
		account.setBalance(1000);
		customer.addAccount(account);
		Account account2 = new Account();
		account2.setAccountType(EAccountType.DOLAR);
		account2.setBalance(1500);
		customer.addAccount(account2);
		customers.add(customer);
		// 2
		customer = new Customer();
		customer.setName("ali");
		customer.setSurname("veli");
		customer.setUsername("aliv");
		customer.setPassword("1234");
		account = new Account();
		account.setAccountType(EAccountType.TL);
		account.setBalance(2000);
		customer.addAccount(account);
		account2 = new Account();
		account2.setAccountType(EAccountType.DOLAR);
		account2.setBalance(2500);
		customer.addAccount(account2);
		customers.add(customer);
		return customers;
	}

}
