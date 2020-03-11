package ykb.com.ykb.java.project.customer.commands;

import ykb.com.ykb.java.project.customer.EAccountType;

public class EuroCekCommand extends AbstractCekmeYatirmaCommand {

	public EuroCekCommand() {
		super("Euro miktarını giriniz", EAccountType.EURO, "Euro accountunuz yok.", true);
	}

	@Override
	public String getMenuStr() {
		return "Euro Çek";
	}

}
