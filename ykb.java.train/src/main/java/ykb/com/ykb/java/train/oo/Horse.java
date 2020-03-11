package ykb.com.ykb.java.train.oo;

public class Horse extends Animal{
	
	public Horse() {
		super("at");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ses() {
		System.out.println(name + " aaaaa");
	}
	
	@Override
	public void hareket() {
		System.out.println("Tırıs");
	}
	
}
