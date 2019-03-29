package HomeWorks;

import java.util.Scanner;

public class arraystasks {
	public static void main(String[] args) {
	    String [] r={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	    int size=r.length;
	    Scanner sc=new Scanner(System.in);
	    for (int i=1; i<=7;i++) 
	    System.out.println("Please enter the day "+i+ " of the week");
	    for (int b=0; b<=size-1;b++)
	    System.out.println(r[b]);
	
	
	int [] year= {2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020};
	 for (int k=0; k<=11-1; k++ ) {
	 System.out.println(year[k]);
	 }
	
	}
	}
	
