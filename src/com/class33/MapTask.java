
package com.class33;

import java.util.*;

public class MapTask{
	public static void main(String[] args) {
		
	
	Map<Integer,String>map=new HashMap<>();
	map.put(1,"Google");
	map.put(2, "Syntax");
	map.put(3, "Facebook");
	map.put(4, "Apple");
	map.put(5, "Syntax");
	map.put(6, "Facebook");
	map.put(7, "Google");
	System.out.println(map.size());
	map.replace(4, "Samsung");
	map.remove(7);
	System.out.println(map);
	Set<Integer>key=map.keySet();
	
	for(Integer keys:key) {
		System.out.println(keys);
	}
	 Iterator<Integer> keysIt=key.iterator();
	 while (keysIt.hasNext()) {
		 System.out.println(keysIt.next()+" ");
	 }
	 Collection<String>valCol=map.values();
	 for(String value:valCol) {
		 System.out.print(value+" ");
	 }
	 Iterator<String>itValues=valCol.iterator();
	 while(itValues.hasNext()) {
		 System.out.println(itValues.next()+" ");
	 }
	 
	
}
}