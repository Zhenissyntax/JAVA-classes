package com.class11;

public class DArrays {

	public static void main(String[] args) {
		// let's create an array of names thats will hold 5 elements and retrieve all values
    String [] names = new String[5];
    names [0]= "Asel";
    names[1]="Awet";
    names[2]="Arif";
    names[3]="Weqas";
    names[4]="Dzimtri";
    for (int i=0; i<names.length; i++) {
    	System.out.println(names[i]);
    }
		//create an array using array literal
    String [] studentsNames= {"Shaban", "Bilal","Mehmet", "Zaki","Samir","Frank"};
    for (int i=0; i<=studentsNames.length-1;i++) {
    	System.out.println(studentsNames[i]);
    }
		
	//retrieve values using : advanced for loop, for each loop,enhanced for  loop
   System.out.println();
    for (String student: studentsNames) {
    	System.out.println(student);
    }
	
    
    //create an array of integers and find largest number
    int [] arr= {115,18,25,49,53};
    int largest=arr[3];
    for (int i=0; i<arr.length;i++) {
    	if (arr[i]>largest) {
    		largest=arr[i];
    		}
    	
    	}
 System.out.println(largest);
    }
	
	}


