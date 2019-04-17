package com.class22;
public class FrontEnd extends Developer{
	private void doHtml() {
		System.out.println("Front Developers do HTML coding");
	}
	public static void main(String[] args) {
		FrontEnd fedv=new FrontEnd();
		fedv.salary=140000;
		fedv.getPaid();
		fedv.code();
		
		fedv.doHtml();
		
		
	}
	
}