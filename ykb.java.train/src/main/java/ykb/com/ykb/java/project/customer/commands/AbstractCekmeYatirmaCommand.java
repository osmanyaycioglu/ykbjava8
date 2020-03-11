package ykb.com.ykb.java.project.customer.commands;

import java.util.List;
import java.util.Scanner;

import ykb.com.ykb.java.project.customer.Account;
import ykb.com.ykb.java.project.customer.Customer;
import ykb.com.ykb.java.project.customer.EAccountType;
import ykb.com.ykb.java.project.customer.IATMCommand;

public abstract class AbstractCekmeYatirmaCommand implements IATMCommand {
	private String cekmeStr;
	private EAccountType accountType;
	private String errorStr;
	private boolean cekme;

	public AbstractCekmeYatirmaCommand(final String cekmeStr, final EAccountType accountType, final String errorStr,
			final boolean cekme) {
		super();
		this.cekmeStr = cekmeStr;
		this.accountType = accountType;
		this.errorStr = errorStr;
		this.cekme = cekme;
	}

	@Override
	public void execute(final Customer customer, final Scanner sc) {
		System.out.println(this.cekmeStr);
		int paraMiktari = sc.nextInt();
		List<Account> accounts = customer.getAccounts();
		Account accountThat = null;
		for (Account account : accounts) {
			if (account.getAccountType() == this.accountType) {
				accountThat = account;
				break;
			}
		}
		if (accountThat == null) {
			System.out.println(this.errorStr);
			return;
		}
		double balance = accountThat.getBalance();
		if (this.cekme) {
			accountThat.setBalance(balance - paraMiktari);
		} else {
			accountThat.setBalance(balance + paraMiktari);

		}
		System.out.println(this.accountType + " hesabınızda " + accountThat.getBalance());
	}

}
