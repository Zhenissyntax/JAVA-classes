
package com.class33;

import java.util.*;

public class KeyAndValuesUsingEntrySet{
	
	public static void main(String[] args) {
		Map<String,String>userDetailsMap=new TreeMap<>();
		userDetailsMap.put("Name","Alex Smith");//1 entry=Key=Name+calue+Alex Smith
		userDetailsMap.put("Salary","90000");
		userDetailsMap.put("Department","IT");
		userDetailsMap.put("Title","Automation Tester");//
		
		System.out.println(userDetailsMap);
		System.out.println(userDetailsMap.entrySet());
		for(Map.Entry entry:userDetailsMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
			
			Iterator<Map.Entry<String, String>>it=userDetailsMap.entrySet().iterator();
			while(it.hasNext()) {
				Map.Entry entry2=it.next();
				System.out.println(entry2.getKey()+":"+entry2.getValue());
			}
		}
	}
}