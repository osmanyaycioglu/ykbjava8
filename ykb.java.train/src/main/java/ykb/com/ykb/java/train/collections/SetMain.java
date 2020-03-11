package ykb.com.ykb.java.train.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
	public static void main(final String[] args) {
		Set<String> set1 = new HashSet<>();

		Set<String> set4 = new TreeSet<>();

		set1.add("osman1");
		set1.add("osman1");
		set1.add("osman1");
		set1.add("osman1");
		set1.add("osman1");
		set1.add("osman1");
		set1.add("osman2");
		set1.add("osman3");
		System.out.println(set1);
		set1.remove("osman1");
		set1.add("osman1");
		System.out.println(set1);

		Set<String> set2 = new HashSet<>();
		set2.add("osman1");
		set2.add("osman3");
		set2.add("osman4");
		set2.add("osman5");
		set2.add("osman6");
		set2.add("osman7");
		set2.add("osman8");
		set2.add("osman9");

		Set<String> set3 = new HashSet<>(set2);

		set2.retainAll(set1);
		System.out.println(set2); // Kesişimi
		set2.addAll(set1);
		System.out.println(set2); // Birleşim
		set2.removeAll(set1);
		System.out.println(set2); // Set2 den Set1 i çıkar
		for (String string : set2) {
			System.out.println(string);
		}
	}
}
