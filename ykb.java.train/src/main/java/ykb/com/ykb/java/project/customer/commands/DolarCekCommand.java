package ykb.com.ykb.java.project.customer.commands;

import ykb.com.ykb.java.project.customer.EAccountType;

public class DolarCekCommand extends AbstractCekmeYatirmaCommand {

	public DolarCekCommand() {
		super("Dolar miktarını giriniz", EAccountType.DOLAR, "Dolar accountunuz yok.", true);
	}

	@Override
	public String getMenuStr() {
		return "Dolar Çek";
	}

}
