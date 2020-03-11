package ykb.com.ykb.java.project.customer.commands;

import ykb.com.ykb.java.project.customer.EAccountType;

public class TLYatirCommand extends AbstractCekmeYatirmaCommand {

	public TLYatirCommand() {
		super("Yatıracağınız parayı giriniz:", EAccountType.TL, "TL accountunuz yok. Açtırın", false);
	}

	@Override
	public String getMenuStr() {
		return "TL Yatır";
	}

}
