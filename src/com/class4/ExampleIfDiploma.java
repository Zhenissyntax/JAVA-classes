package com.class4;

public class ExampleIfDiploma {
	public static void main(String[] args) {
		double gpa=3.5;
		double expectedgpa=3.0;
				boolean hasDiploma=true;
			
				
				if (hasDiploma) {
					System.out.println("Congratulations!");
				  if (gpa>expectedgpa) {
					System.out.println("You are hired");
				} else  {
							System.out.println("We cannot hire you");
				}
				} else {  
					System.out.println("Please get your degree");
				}
	
	}
}
