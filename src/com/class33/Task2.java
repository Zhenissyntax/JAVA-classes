
package com.class33;

import java.util.*;

public class Task2 {
	public static void main(String[] args) {
		Map<String, String> ct = new HashMap();
		ct.put("Kaz", "Astana");
		ct.put("USA", "Washington");
		ct.put("Rus", "Moscow");
		ct.put("England", "London");
		ct.put("Canada", "Toronto");
          System.out.println(ct);
		Set<String> key = ct.keySet();

		for (String keys : key) {
			System.out.println(keys);
			System.out.println();
			Iterator<String> keysIt = key.iterator();
			while (keysIt.hasNext()) {
				System.out.println(keysIt.next() + " ");
			}
			System.out.println();
			Collection<String> valCol = ct.values();
			for (String value : valCol) {
				System.out.print(value + " ");
			}
			System.out.println();
			System.out.println();
			Iterator<String> itValues = valCol.iterator();
			while (itValues.hasNext()) {
				System.out.println(itValues.next() + " ");
			}
		}
	}
}
