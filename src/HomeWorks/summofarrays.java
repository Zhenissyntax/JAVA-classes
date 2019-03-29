
package HomeWorks;
public class summofarrays{
	public static void main(String[] args) {
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};
			 for (int i=0; i<=a.length; i++){
			 int   sum =(a[i][0] + a[i][1]+a[i][2]);
			System.out.println(sum);
			 }
			
		
	}
}