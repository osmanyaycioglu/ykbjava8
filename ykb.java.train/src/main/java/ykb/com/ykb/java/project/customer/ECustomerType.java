package ykb.com.ykb.java.project.customer;

import java.util.ArrayList;
import java.util.List;

import ykb.com.ykb.java.project.customer.commands.DolarCekCommand;
import ykb.com.ykb.java.project.customer.commands.DolarYatirCommand;
import ykb.com.ykb.java.project.customer.commands.EuroCekCommand;
import ykb.com.ykb.java.project.customer.commands.EuroYatirCommand;
import ykb.com.ykb.java.project.customer.commands.HesabiGor;
import ykb.com.ykb.java.project.customer.commands.TLCekCommand;
import ykb.com.ykb.java.project.customer.commands.TLYatirCommand;

public enum ECustomerType {
	GUMUS {
		@Override
		public List<IATMCommand> getCommands() {
			List<IATMCommand> commands = ECustomerType.BRONZ.getCommands();
			commands.add(new DolarYatirCommand());
			commands.add(new DolarCekCommand());
			return commands;
		}

	},
	ALTIN {
		@Override
		public List<IATMCommand> getCommands() {
			List<IATMCommand> commands = ECustomerType.GUMUS.getCommands();
			commands.add(new EuroYatirCommand());
			commands.add(new EuroCekCommand());
			return commands;
		}

	},
	BRONZ {
		@Override
		public List<IATMCommand> getCommands() {
			List<IATMCommand> menu = new ArrayList<>();
			menu.add(new HesabiGor());
			menu.add(new TLYatirCommand());
			menu.add(new TLCekCommand());
			return menu;
		}

	};

	public List<IATMCommand> getCommands() {
		return null;
	}
}
