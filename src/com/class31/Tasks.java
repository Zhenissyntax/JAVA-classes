
package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Tasks{
	public static void main(String[] args) {
		ArrayList<String>cars=new ArrayList<String>();
	cars.add("Toyota");
	cars.add("Toyota");
	cars.add("BMW");
	cars.add("Porshe");
	cars.add("Mercedes");
		for (int i=0; i<cars.size();i++) {
		
	      System.out.println(cars.get(i));
	      
		}
		System.out.println("------------------------");
		Iterator<String>iterator=cars.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println("--------------------------------");
		for(Object vechiles:cars) {
			System.out.println(vechiles);
		}
		System.out.println("------------------------------------------");
		int k=0;
		while(cars.size()>k) {
			String car=cars.get(k);
			System.out.println(car);
			k++;
		}
		
	}
}