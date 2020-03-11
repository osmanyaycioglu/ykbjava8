package ykb.com.ykb.java.project.customer.commands;

import ykb.com.ykb.java.project.customer.EAccountType;

public class DolarYatirCommand extends AbstractCekmeYatirmaCommand {

	public DolarYatirCommand() {
		super("Yatıracağınız Dolar miktarını giriniz:", EAccountType.DOLAR, "Dolar accountunuz yok. Açtırın", false);
	}

	@Override
	public String getMenuStr() {
		return "Dolar Yatır";
	}

}
