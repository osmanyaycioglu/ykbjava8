package ykb.com.ykb.java.project.customer.commands;

import java.util.List;
import java.util.Scanner;

import ykb.com.ykb.java.project.customer.Account;
import ykb.com.ykb.java.project.customer.Customer;
import ykb.com.ykb.java.project.customer.IATMCommand;

public class HesabiGor implements IATMCommand {

	@Override
	public void execute(final Customer customer, final Scanner sc) {
		List<Account> accounts = customer.getAccounts();
		for (Account account : accounts) {
			System.out.println(account.getAccountType() + " paranız : " + account.getBalance());
		}

	}

	@Override
	public String getMenuStr() {
		return "Hesap gör";
	}

}
