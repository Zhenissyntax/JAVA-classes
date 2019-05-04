
package com.class33;


import java.util.*;

public class MapIntro{
	public static void main(String[] args) {
		//Map<Key,Value>
		Map<Integer,String>map=new HashMap<>();
		//add entries=(key+value)
		map.put(101, "John");
		map.put(102, "Jane");
		map.put(103, "Kate");
		map.put(104, "James");
		
		//retrieve or access values
		System.out.println(map.get(102));
		//how to find size of a map
		System.out.println(map.size());
		//how to update value
		map.replace(103, "Bilal");
		System.out.println(map.get(103));
		//how to remove value
		map.remove(104);
		System.out.println(map.size());
		
		// to check if there are any value
		System.out.println(map.isEmpty());
		System.out.println(map);
		//to check if specific key/value is there
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("Bilal"));
		System.out.println(map.getClass());
		map.put(105, "Jane");
		System.out.println(map);
		map.put(101, "Shaban");
		System.out.println(map);
		//adding null key with some value
		map.put(null, "Some values");
		System.out.println(map);
	}
}