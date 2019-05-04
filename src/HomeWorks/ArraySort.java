package HomeWorks;
import java.util.ArrayList;
		import java.util.Collections;
		import java.util.HashSet;
		import java.util.List;

public class ArraySort{
	public static void main(String[] args) {
		

		//Create an HashSet of cities and add
		//duplicates into it. Retrieve all values from hashset in 2
		//different ways.Retrieve  all  values  in  alphabetical order

		
		        HashSet<String> hset=new HashSet<String>();
		        hset.add("Moscow");
		        hset.add("DC");
		        hset.add("Barcelona");
		        hset.add("Astana");
		        
		        System.out.println("Print cities without order "+hset);
		        hset.add("DC");
		        hset.add("Astana");
		        
		       ArrayList<String>tlist= new ArrayList<String>(hset);
		        Collections.sort(tlist);
		        System.out.println(" an Array List with collections.sort() "+tlist);
		        
		        for(String st:tlist) {
		            System.out.println("advance loop with Collections.sort() "+st);
		        }

		    }
		
	}
