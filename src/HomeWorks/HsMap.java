
package HomeWorks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HsMap{
	public static void main(String[] args) {
	ArrayList<String>arr=new ArrayList<String>();
	arr.add("Watermelon");
	arr.add("Pineapple");
	arr.add("Apple");
	arr.add("Orenage");
	
		
	 List<String>tls= new ArrayList<String>(arr);
     Collections.sort(tls);
     System.out.println("Using an Array List with collections.sort() "+tls);
	}
}