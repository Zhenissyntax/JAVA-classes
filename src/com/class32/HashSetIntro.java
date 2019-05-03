
package com.class32;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIntro{
	public static void main(String[] args) {
		HashSet<Integer> hset=new HashSet<>();
		hset.add(35);
		hset.add(44);
		hset.add(78);
		System.out.println(hset.size());
		//SET doesnt keep the order
		System.out.println(hset);
		System.out.println(hset.contains(35));
		// Set Interface does not allow duplicates
		hset.add(44);
		hset.add(35);
		System.out.println(hset.size());
		//to retrieve all values from hashet
		//1.usring advance for loop
		System.out.println("-----------using advance loop-------------");
		for(int num:hset) {
			System.out.println(num);
		}
		//2.using iterator
		System.out.println("--------using Iterator------------");
		Iterator<Integer>iterator=hset.iterator();
		while (iterator.hasNext()) {
			int a=iterator.next();
			System.out.println(a);
		}
	}
}