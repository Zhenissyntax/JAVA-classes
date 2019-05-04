
package com.class33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Task{
	public static void main(String[] args) {
		List<String>aList=new ArrayList<String>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");

    HashSet<String>hs=new HashSet<>(aList);
    System.out.println(hs);
    
		
		
		
	}
}