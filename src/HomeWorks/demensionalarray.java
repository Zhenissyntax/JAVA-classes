
package HomeWorks;
public class demensionalarray{
	public static void main(String[] args) {
		int[][] a = {
				{5,2,3,7},
				{1,5,2,2},
				{1,2,3,4}
			};
		  int row = 2;
	        int total = 0;
	        for (int j = 0; j < a[row].length; j++) {
	            total = total + a[row][j];
	        }
	        System.out.println( total);
	        
	}
}