
package com.class21;
public  class TaskPrivate{
	private TaskPrivate() {
		System.out.println("This is constructor");
	}
	public static void main(String[] args) {
		TaskPrivate obj=new TaskPrivate();
	}
}