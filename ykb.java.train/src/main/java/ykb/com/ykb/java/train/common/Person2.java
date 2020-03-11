package ykb.com.ykb.java.train.common;

public class Person2 {
	private String name;
	private String surname;
	private int age;
	
	
	public static Person2 generatePersonVersion1(String name,String surname,int age) {
		return new Person2(name, surname, age);
	}
	
	
	public Person2(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public Person2(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public int getAge() {
		return age;
	}
	
	
}
