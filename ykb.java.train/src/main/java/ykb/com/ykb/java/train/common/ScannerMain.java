package ykb.com.ykb.java.train.common;

import java.util.Random;
import java.util.Scanner;

public class ScannerMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayı giriniz : ");
		int inNum = sc.nextInt();
		System.out.println("Adnızı giriniz : ");
		String inStr = sc.next();
		System.out.println("Adınız : " + inStr + " sayı : " + inNum);
		
		Random random = new Random();
		int nextInt = random.nextInt(100);
		 
	}
}
