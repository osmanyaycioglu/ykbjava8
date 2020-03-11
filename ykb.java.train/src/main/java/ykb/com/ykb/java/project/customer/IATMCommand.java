package ykb.com.ykb.java.project.customer;

import java.util.Scanner;

public interface IATMCommand {
	void execute(Customer customer, Scanner sc);

	String getMenuStr();
}
