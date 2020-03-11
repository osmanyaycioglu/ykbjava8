package ykb.com.ykb.java.train.common;

public class BuilderPersonMain {
	public static void main(String[] args) {
		Person3 p = Person3.getBuilder()
						.withName("osman")
						.withSurname("yaya")
						.withAge(50)
						.build();
		
	}
}
