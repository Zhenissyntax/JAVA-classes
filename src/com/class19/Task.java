package com.class19;
public class Task{
	 String createEmail(String name, String lastName, String emailtype) {
		return name+lastName+emailtype;
		
	}
	public static void main(String[] args) {
		Task obj= new Task();
	  String ob= obj.createEmail("john", "snow", "@gmail.com");
	  System.out.println(ob);
	}
}