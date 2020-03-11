package ykb.com.ykb.java.train.interfaces;

public abstract class AbstractExecution implements IMyIntf {

	@Override
	public void abc() {
		System.out.println("ABC impl " + this.xyz());
		String execute = this.execute(this.xyz(), 1);
		System.out.println(execute);

	}

	abstract String xyz();

}
