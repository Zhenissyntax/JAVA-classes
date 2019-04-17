package com.class24;
public class TaskThree{
	
	private void M() {
		System.out.println("method1");
	}
	private void M(String d) {
		System.out.println("method String");
	}
	private void M(int f) {
		System.out.println(77777);
	}
	public static void main(String[] args) {
		TaskThree d=new TaskThree();
		d.M();
		d.M(88);
		d.M("HEy");
	}
}