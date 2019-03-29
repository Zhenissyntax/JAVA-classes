package HomeWorks;

public class DemensionalArrays2 {
public static void main(String[] args){

	double[][] a = {
		{1.4,2.0,3.3,2},
		{4,1.5,6.1,1},
		{1.2,3.1,4,1.6}
	};
	
	//Double and print array
       for (int i=0; i<a.length; i++) {
    	   for ( int k=0; k<a[i].length;k++) {
    		  
    		   System.out.println(a[i][k]*2);
    	   }
       }
	}
		
}

	
	

