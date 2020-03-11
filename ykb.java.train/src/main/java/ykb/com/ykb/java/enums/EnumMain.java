package ykb.com.ykb.java.enums;

public class EnumMain {
	public static final int STATUS_STARTING = 1;
	public static final int STATUS_RUNNING = 2;
	public static final int STATUS_PAUSED = 3;

	public static void main(final String[] args) {
		int index = 1;
		switch (index) {
		case STATUS_STARTING: {
			String str = "soa";
			System.out.println("1");
		}
			break;
		case STATUS_RUNNING: {
			String str = "osos";
			System.out.println("2");
		}
			break;
		case STATUS_PAUSED:
			System.out.println("3");
			break;

		default:
			break;
		}

		EStatus status = EStatus.STARTING;
		switch (status) {
		case PAUSED:
			System.out.println("Paused");
			break;
		case RUNNING:
			System.out.println("Running");
			break;
		case STARTING:
			System.out.println("starting");
			break;
		default:
			break;
		}

		EStatus eStatus = EStatus.RUNNING;
		String hello = eStatus.hello();
		System.out.println(hello);
	}
}
