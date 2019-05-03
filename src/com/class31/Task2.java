
package com.class31;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2{
	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<String>();
		words.add("Apple");
		words.add("Knife");
		words.add("Car");
		words.add("Building");
        Iterator<String>it=words.iterator();
     
        while(it.hasNext()) {
        	String words1=it.next();
        	if( words1.contains("e")) {
        		it.remove();
        		
        	}
        }
        System.out.println(words);	

        System.out.println("----TASK   3");
        
        ArrayList<String>drinks=new ArrayList<String>();
        drinks.add("Cola");
        drinks.add("Pepsi");
        drinks.add("Sprite");
        drinks.add("milk");
        for(int i=0; i<drinks.size(); i++) {
        	String dr=drinks.get(i);
        	if(dr.contains("e") || dr.contains("a")) {
        		drinks.set(i, "Water");
        	}
        }
        System.out.println(drinks);
	}
	
	
}


