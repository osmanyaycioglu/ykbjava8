package ykb.com.ykb.java.train.common;

public class ImmutablePersonMain {
	public static void main(String[] args) {
		Person2 person = new Person2("osman", "yay", 50);
		
		Person2 person2 = Person2.generatePersonVersion1("osman", "yay", 50);
	}
}
