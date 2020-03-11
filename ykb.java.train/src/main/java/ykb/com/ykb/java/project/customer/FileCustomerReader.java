package ykb.com.ykb.java.project.customer;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCustomerReader implements ICustomerReader {

	@Override
	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<>();
		try {
			List<String> readAllLines = Files.readAllLines(Paths.get("cust.txt"));
			for (String string : readAllLines) {
				String[] split = string.split(",");
				Customer customer = new Customer();
				customer.setName(split[0]);
				customer.setSurname(split[1]);
				customer.setUsername(split[2]);
				customer.setPassword(split[3]);
				customer.setCustomerType(ECustomerType.valueOf(split[4]));
				customer.setAccounts(this.parseAccount(split[5]));
				customers.add(customer);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return customers;
	}

	private List<Account> parseAccount(final String string) {
		List<Account> accounts = new ArrayList<>();
		String[] split = string.split(";");
		for (String accStr : split) {
			accounts.add(this.parseAcc(accStr));
		}
		return accounts;
	}

	private Account parseAcc(final String accStr) {
		Account account = new Account();
		String[] split = accStr.split("#");
		account.setAccountType(EAccountType.valueOf(split[0]));
		account.setBalance(Double.parseDouble(split[1]));
		return account;
	}

}
