package ykb.com.ykb.java.train.oo;

public class Animal {
	
	protected String name;

	public Animal(String name) {
		this.name = name;
		
	}
	
	public void ses() {
		System.out.println("Ses : " + name);
	}

	public void yemek() {
		System.out.println("Yemek");
	}

	public void hareket() {
		System.out.println("Hareket");
	}

}
