package ykb.com.ykb.java.train.common;

public class Person3 {
	private String name;
	private String surname;
	private int age;
	
	private Person3() {
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
	
	public static Person3Builder getBuilder() {
		return new Person3Builder();
	}
	public static class Person3Builder {
		
		private Person3 person3 = new Person3();
		
		private Person3Builder() {
		}
		
		public Person3Builder withName(String name) {
			person3.name = name;
			return this;
		}
		
		public Person3Builder withSurname(String name) {
			person3.surname = name;
			return this;
			
		}
		public Person3Builder withAge(int age) {
			person3.age = age;
			return this;
		}
		
		public Person3 build() {
			return person3;
		}

		public Person3 buildVersion2() {
			//Validation
			return person3;
		}

	}
	
	
}
