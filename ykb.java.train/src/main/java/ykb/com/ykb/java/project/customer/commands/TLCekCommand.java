package ykb.com.ykb.java.project.customer.commands;

import ykb.com.ykb.java.project.customer.EAccountType;

public class TLCekCommand extends AbstractCekmeYatirmaCommand {

	public TLCekCommand() {
		super("Çekeceğiniz TL miktarı : ", EAccountType.TL, "TL accountunuz yok.", true);
	}

	@Override
	public String getMenuStr() {
		return "TL Çek";
	}

}
