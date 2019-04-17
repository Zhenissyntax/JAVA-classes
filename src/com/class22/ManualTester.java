

package com.class22;
public class ManualTester extends Tester{
	private void testManualy() {
		System.out.println("Manual Testers do Test Manualy");
	}
	public static void main(String[] args) {
		ManualTester tm=new ManualTester();
		tm.salary=95000;
		tm.getPaid();
		tm.testManualy();
		
	}
}