
package com.class22;
public class AutomationTesters extends Tester{
	private void codeInJava() {
		System.out.println("Automation Testers write codes in Java to test");
		
	}
	public static void main(String[] args) {
		AutomationTesters at=new AutomationTesters();
		at.salary=120000;
		at.getPaid();
		at.codeInJava();
	}
}