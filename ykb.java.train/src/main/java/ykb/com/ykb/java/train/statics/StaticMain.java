package ykb.com.ykb.java.train.statics;

public class StaticMain {
	public static void main(String[] args) {
		MyStaticTest.a = 200; // a = 200
		MyStaticTest m = new MyStaticTest();
		m.method1(400); // a = 400
		MyStaticTest m2 = new MyStaticTest();
		m2.method1(405); // a = 405
		
		m.print();
		m2.print();
	}
}
