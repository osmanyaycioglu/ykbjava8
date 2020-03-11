package ykb.com.ykb.java.project.customer;

public class CustomerReaderFactory {
	public static ICustomerReader createCustomerReader(final EReaderType e) {
		switch (e) {
		case MANUAL:
			return new ManualCustomerReader();

		default:
			return new ManualCustomerReader();
		}
	}
}
