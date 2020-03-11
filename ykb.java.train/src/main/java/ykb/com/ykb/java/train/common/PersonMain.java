package ykb.com.ykb.java.train.common;

public class PersonMain {
	public static void main(String[] args) {
		Person per = new Person();
		per.setName("osman");
		per.setSurname("yay");
		per.setAge(50);

		Person per2 = new Person("osman", "yay", 50);

		Person per3 = new Person()
					.setName("osman")
					.setSurname("yay")
					.setAge(50);
		
		Person per4 = Person.generatePersonVersion1("osman", "yay", 50);
	}
}
