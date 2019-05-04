
package com.class33;

import java.util.*;

public class Task3{
	public static void main(String[] args) {
		//Create a map of Best Buy store. Place
		//item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
		//Print all keys and values from a Best Buy map using EntrySet.
		Map<Integer,String>store=new LinkedHashMap<>();
		store.put(78458, "Printer");
		store.put(748965, "Tv");
		store.put(78945, "CellPhones");
		store.put(78945, "Laptops");
		store.put(789546, "SmartWatches");
		for(Map.Entry<Integer,String>bb:store.entrySet()) {
			System.out.println(bb.getKey()+":"+bb.getValue());
			}
		
		System.out.println("////////////////////////////////////");
		
		Iterator<Map.Entry<Integer,String>>products=store.entrySet().iterator();
		while(products.hasNext()) {
			Map.Entry<Integer, String>a=products.next();
			System.out.println(a.getKey()+":"+a.getValue());
		}
		
	}
}