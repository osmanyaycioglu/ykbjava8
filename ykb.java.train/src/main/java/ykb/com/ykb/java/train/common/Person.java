package ykb.com.ykb.java.train.common;

public class Person {
	private String name;
	private String surname;
	private int age;
	
	public Person() {
	}
	
	public static Person generatePersonVersion1(String name,String surname,int age) {
		return new Person(name, surname, age);
	}
	
	public Person(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public Person(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}
	public Person setName(String name) {
		this.name = name;
		return this;
	}
	public String getSurname() {
		return surname;
	}
	public Person setSurname(String surname) {
		this.surname = surname;
		return this;
	}
	public int getAge() {
		return age;
	}
	public Person setAge(int age) {
		this.age = age;
		return this;
	}
	
	
	
}
