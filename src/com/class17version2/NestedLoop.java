package com.class17version2;

public class NestedLoop {
public static void main(String[] args) {
	NestedLoop method=new NestedLoop ();
	method.Nested();

	
}
   void Nested () {
	   for (int h=0; h<24; h++) {
			for (int m=0; m<60; m++) {
				if (m<10) {
					System.out.println(h+" :0" +m);
				}else {
					System.out.println(h+":"+m);
				}
				
			}
		}
		
	}

	   
   }
	







