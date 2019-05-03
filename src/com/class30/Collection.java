
package com.class30;

import java.util.ArrayList;

public class Collection{
	public static void main(String[] args) {
		
	
	ArrayList<String> names=new ArrayList<String>();
	names.add("John");
	names.add("Mike");
	names.add("Kevin");
	names.add("Leo");
	names.add("Steve");
	System.out.println(names.size());
	for (int i=0; i<names.size(); i++) {
		if(!names.isEmpty()) {
		System.out.println(names.get(i));
	}
	}
}
}