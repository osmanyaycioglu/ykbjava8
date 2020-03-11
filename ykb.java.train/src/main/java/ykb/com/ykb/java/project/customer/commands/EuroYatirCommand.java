package ykb.com.ykb.java.project.customer.commands;

import ykb.com.ykb.java.project.customer.EAccountType;

public class EuroYatirCommand extends AbstractCekmeYatirmaCommand {

	public EuroYatirCommand() {
		super("Yatıracağınız Euro miktarını giriniz:", EAccountType.EURO, "Euro accountunuz yok. Açtırın", false);
	}

	@Override
	public String getMenuStr() {
		return "Euro Yatır";
	}

}
