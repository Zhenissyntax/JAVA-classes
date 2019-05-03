
package HomeWorks;
import java.util.ArrayList;


class arrayList {
 
    public static boolean  ismpty(){
     return true;
    }
    public static boolean notEmpt(){
       return false;
    }
     public static void main(String[] args) {
    ArrayList <Integer>it=new ArrayList<Integer>();
    
    for (int i=0; i<it.size(); i++) {
		if(it.isEmpty()) {
		System.out.print(ismpty());
		}else {
			notEmpt();
		}
	}
    
  }
}