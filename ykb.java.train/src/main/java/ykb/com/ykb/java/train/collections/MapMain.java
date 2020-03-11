package ykb.com.ykb.java.train.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import ykb.com.ykb.java.train.Arac;

public class MapMain {
	public static void main(final String[] args) {
		Map<String, Arac> aracMap = new HashMap<>();

		Map<String, Arac> aracMapThreadSafe = new Hashtable<>();

		Map<String, Arac> aracMapThreadSafe2 = new ConcurrentHashMap<>(1_000_000, 0.9f, 10_000);

		aracMap.put("arac1", new Arac(4, 100, 1200, 170));
		aracMap.put("arac2", new Arac(4, 120, 1300, 170));
		aracMap.put("arac3", new Arac(4, 130, 1400, 170));
		aracMap.put("arac1", new Arac(4, 150, 1200, 170));
		System.out.println(aracMap);
		Arac remove = aracMap.remove("arac2");
		System.out.println(remove);
		Arac aracGet = aracMap.get("arac3");
		System.out.println(aracGet);
		boolean containsKey = aracMap.containsKey("arac3");
		// 1
		Set<String> keySet = aracMap.keySet();
		for (String keyStr : keySet) {
			Arac arac = aracMap.get(keyStr);
			System.out.println(arac);
		}
		// 2
		Collection<Arac> values = aracMap.values();
		for (Arac arac : values) {
			System.out.println(arac);
		}
		// 3
		Set<Entry<String, Arac>> entrySet = aracMap.entrySet();
		for (Entry<String, Arac> entry : entrySet) {
			System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
		}

	}
}
