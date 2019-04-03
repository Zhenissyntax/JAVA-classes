package com.class14;
public class Exercises{
	public static void main(String [] args) {
		
		int a=7;
		int b=5;
		
		System.out.println("Before swapping a= "+a+" b= "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Before swapping a= "+a+" b= "+b);
		
		
		String c="sprinters";
		String d="tech";
		 System.out.println("Before swap: " + c + " " + d); 
		 c=c+d;
		 d= c.substring(0, c.length() - d.length());  
	        c = c.substring(d.length());  
	        System.out.println("After : " + c + " " + d);  

	     //-------------------------------
	        int arr[] = { 1000, 46, 1, 86, 292, 2 };
	        
	        int min = arr[0];//0
	        int secondLargest = 0;//0
	        int largest = 0;//0
	        
	        for(int k: arr) {
	            if(k>largest) {
	                largest =k;
	            }
	            if(k < min) {
	                min = k;
	            }
	        }
	        for(int k: arr) {
	            
	            if(a> secondLargest && a <largest) {
	                
	                secondLargest = k;
	            }
	        }
	        System.out.println(" minimum" + min);
	        System.out.println("Second largest= " + secondLargest);

	        System.out.println("Largest= " + largest);
	
	
	//Task 3------------------------------------
	String str = "212$%*&Transformer45678%@";
	        String replaced=str.replaceAll("[A-z0-9]","");
	        System.out.println(replaced.length());
	        System.out.println(replaced);
		 //task4 ----------------------------------------------
	        
	        String st="Today we did many tasks";
	        String [] arrr=st.split(" ");
	        System.out.println(arrr.length);
	        
	        
	        
	        //task5-------------------------------
	        String str2="Coding & Java";
			char [] array1=str2.toCharArray();
			for (int i=array1.length-1; i>=0;i--) {
				System.out.print(array1[i]);
	        
			}
	System.out.println();
			String str3 ="Today is Sunday Java class";
	        String newString = str3.substring(9,15);    
	        String newString2 = str3.substring(0,5);
	    
	        System.out.println(newString +" " +newString2);

	//output is Sunday Today
	//----------------------------------------------------------------------------------------
	
	}
}