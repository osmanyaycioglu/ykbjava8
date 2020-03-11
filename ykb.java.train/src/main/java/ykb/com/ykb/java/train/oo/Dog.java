package ykb.com.ykb.java.train.oo;

public class Dog extends Animal {
	
	public Dog() {
		super("köpek");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void ses() {
		System.out.println(name + " Hav Hav");
	}
	@Override
	public void hareket() {
		System.out.println("Dört ayak yürüyorum");
	}
	
}
