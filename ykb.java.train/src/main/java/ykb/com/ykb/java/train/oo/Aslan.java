package ykb.com.ykb.java.train.oo;

public final class Aslan extends Cat {

	public Aslan() {
		super("Aslan");
	}

	@Override
	public final void ses() {
		System.out.println("Roooorr");
		super.ses();
	}

	public void finalTest(final int a, final Cat cat) {
		System.out.println("ashjdkjashd");
		System.out.println("a : " + a);
		cat.ses();
	}

}
