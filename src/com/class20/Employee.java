
package com.class20;
public class Employee{
	static String CEO="Sumair";
   int eID;
	int salary;

public static void main(String[] args) {
	
	 Employee empl1= new Employee();
	  empl1.eID=7;
	 empl1.salary=100;
	System.out.println("eID:  "+empl1.eID+"   Salary:  "+empl1.salary+"K"+ "  CEO :  "+CEO);
	System.out.println();
	
	Employee empl2=new Employee();
	empl2.eID=25;
	empl2.salary=150;
	System.out.println("eID: "+empl2.eID+"  Salary:  "+empl2.salary+"K"+"  CEO : "+CEO);
	
}


}