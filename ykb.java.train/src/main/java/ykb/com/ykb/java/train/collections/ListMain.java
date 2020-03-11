package ykb.com.ykb.java.train.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListMain {

	public static class A {
		private int a;
		private int b;

		public int getA() {
			return this.a;
		}

		public void setA(final int a) {
			this.a = a;
		}

		public int getB() {
			return this.b;
		}

		public void setB(final int b) {
			this.b = b;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = (prime * result) + this.a;
			result = (prime * result) + this.b;
			return result;
		}

		@Override
		public boolean equals(final Object obj) {
			if (this == obj) {
				return true;
			}
			if (obj == null) {
				return false;
			}
			if (this.getClass() != obj.getClass()) {
				return false;
			}
			A other = (A) obj;
			if (this.a != other.a) {
				return false;
			}
			if (this.b != other.b) {
				return false;
			}
			return true;
		}

		@Override
		public String toString() {
			return "A [a=" + this.a + ", b=" + this.b + "]";
		}

	}

	public static void main(final String[] args) {
		List<String> strList = new ArrayList<>(1_000_000);

		List<String> strList2 = new LinkedList<>();

		List<String> strListThreadSafe = new Vector<>(1_000_000);

		List<String> strListThreadSafe2 = Collections.synchronizedList(strList);

		List<int[]> intList = new ArrayList<>(1_000_000);

		long delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			strList.add("osman" + i);
		}
		strList.add("osman" + 1722121212L);
		System.out.println("Delta : " + (System.currentTimeMillis() - delta));

		delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			strList.get(i);
		}
		System.out.println("Get Delta : " + (System.currentTimeMillis() - delta));

		for (String str1 : strList) {

		}

		delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000; i++) {
			strList.remove(5);
		}
		System.out.println("Remove Delta : " + (System.currentTimeMillis() - delta));

		strList.add(5, "test");

		strList.remove("test");

		List<A> aList = new ArrayList<>();
		A b = new A();
		b.setA(1);
		b.setB(2);
		aList.add(b);

		A c = new A();
		c.setA(1);
		c.setB(2);

		System.out.println("C : " + c);
		aList.remove(c);
	}
}
