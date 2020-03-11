package ykb.com.ykb.java.enums;

public enum EStatus {
	STARTING(1), RUNNING(2) {
		@Override
		public String hello() {
			return "mello";
		}
	},
	PAUSED(3);

	private int index;

	private EStatus(final int index) {
		this.index = (index);
	}

	public int getIndex() {
		return this.index;
	}

	public String hello() {
		return "hello";
	}

}
