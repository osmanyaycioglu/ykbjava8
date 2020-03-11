package ykb.com.ykb.java.train.interfaces;

public class IntfMain {
	public static void main(final String[] args) {
		IMyIntf imf = new Execution2();
		String execute = imf.execute("osman", 0);
		System.out.println(execute);

	}
}
