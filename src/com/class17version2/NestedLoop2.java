package com.class17version2;

public class NestedLoop2 {
	public static void main(String[] args) {
		NestedLoop2 demo = new NestedLoop2();
		demo.printNumber();
		demo.printNumber();
		System.out.println();
	}

	void printNumber() {
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					System.out.println(a + "" + b + "" + c);
				}
			}
		}
	}

}
