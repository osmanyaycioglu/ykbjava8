package ykb.com.ykb.java.train.oo;

public class Cat extends Animal {	
	public Cat() {
		super("Kedi");
	}
	public Cat(String name) {
		super(name);
	}

	@Override
	public void ses() {
		System.out.println(name +  " Miyav");
		super.ses();
	}
	
}
