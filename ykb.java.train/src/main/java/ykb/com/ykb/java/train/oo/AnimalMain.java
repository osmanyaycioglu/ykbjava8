package ykb.com.ykb.java.train.oo;

import java.util.Scanner;

public class AnimalMain {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Tipi giriniz");
			int nextInt = sc.nextInt();
//			notpolyMethod(nextInt);
			Animal animal = AnimalFactory.createAnimal(nextInt);
			AnimalMain.polyMethod(animal);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void polyMethod(Animal animal) {
		animal.ses();
		animal.hareket();
		animal.yemek();
	}
	
	public static void notpolyMethod(int type) {
		switch (type) {
		case 1:
			System.out.println("Ses");
			System.out.println("Hareket");
			System.out.println("yemek");
			break;

		case 2:
			System.out.println("Miyav");
			System.out.println("Hareket");
			System.out.println("yemek");
			break;
		case 3:
			System.out.println("Havhav");
			System.out.println("Hareket");
			System.out.println("yemek");
			break;
		case 4:
			System.out.println("aaaaa");
			System.out.println("Tırıs");
			System.out.println("yemek");
			break;
		default:
			break;
		}
	}

	public static void notpolyMethod() {
		System.out.println("Ses");
		System.out.println("Hareket");
		System.out.println("yemek");
	}

	public static void notpolyMethodCat() {
		System.out.println("Miyav");
		System.out.println("Hareket");
		System.out.println("yemek");
	}

}
