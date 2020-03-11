package ykb.com.ykb.java.train.oo;

public class AnimalFactory {
	public static Animal createAnimal(int tip) {
		Animal animal = null;
		switch (tip) {
		case 1:
			animal = new Animal("hayvan");
			break;
		case 2:
			animal = new Cat();
			break;
		case 3:
			animal = new Dog();
			break;
		case 4:
			animal = new Horse();
			break;

		case 5:
			animal = new Aslan();
			break;
		default:
			animal = new Animal("hayvan");
			break;
		}
		
		return animal;

	}
}
