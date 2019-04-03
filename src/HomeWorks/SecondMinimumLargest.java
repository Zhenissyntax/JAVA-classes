package HomeWorks;
public class SecondMinimumLargest {
	public static void main(String[] args) {
		int array[] = {0,1,2,3,4,5,6,7,8,9,120};
		int min=array[0];
		int Slrg=0;
		int large=0;
		for (int  a:array) {
			if ( a<min) {
				min=a;
				
			}else if (a>large) {
				large=a;
			} 
		}
			for (int a:array) {
			if (a>Slrg && large<a ) {
				Slrg=a;
			}
		}
		System.out.println("min= "+min);
		System.out.println("Second Large= "+Slrg);
		System.out.println("Large= "+large);
	}
}