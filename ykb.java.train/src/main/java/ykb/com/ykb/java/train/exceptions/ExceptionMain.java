package ykb.com.ykb.java.train.exceptions;

import java.util.Scanner;

import org.omg.CosNaming.NamingContextPackage.AlreadyBound;

public class ExceptionMain {
	public static void main(String[] args) {
		MyExceptionTest test = new MyExceptionTest();
		test.method2("osman");
		try {
			String sonuc = test.method1(null);
			System.out.println(sonuc);
		} catch (MyException e) {
			System.err.println("Error : " + e.getMesaj());
		} catch (AlreadyBound e) {
			System.err.println("Error : " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());

		}

		try {
			String sonuc = test.method1(null);
			System.out.println(sonuc);
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());
		}
		// 1.7+
		try {
			String sonuc = test.method1(null);
			System.out.println(sonuc);
		} catch (MyException | AlreadyBound  e) {
			System.err.println("Error : " + e.getMessage());
		} catch (Exception e) {
			System.err.println("Error : " + e.getMessage());

		}
		// 1.6
		Scanner sc2 = new Scanner(System.in);
		try {
			sc2.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc2 != null) {
				sc2.close();
			}
		}
		// 1.7+
		try (Scanner sc = new Scanner(System.in)){
			sc.nextInt();
		} catch (Throwable e) {
		}

	}
}
