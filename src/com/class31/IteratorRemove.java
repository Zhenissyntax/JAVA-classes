
package com.class31;

import java.util.ArrayList;
import java.util.Iterator;



public class IteratorRemove{
	//lest remove an arrayList of Integers form 1-10
	//remove all odds using iteretor
	public static void main(String[] args) {
		
	
	ArrayList<Integer> alist=new ArrayList<>();
	for(int i=1; i<=20; i++) {
		alist.add(i);
	}
	System.out.println(alist);
	Iterator<Integer>iterator=alist.iterator();
	while(iterator.hasNext()) {
		int number=iterator.next();
		if(number%2!=0) {
			iterator.remove();
		}
	}
	System.out.println(alist);
	}	
}