package ykb.com.ykb.java.train.statics;

public class MyStaticTest {
	public static int a = 100;
	private int b;
	
	public void method1(int in) {
		a = in;
		b = in;
	}
	
	public void print() {
		System.out.println("a:" + a +" b:" + b);
	}
	
	public static void printStaticVar() {
		System.out.println("a:" + a);
	}
	
}
