package com.class15;
public class Comp {
	boolean mouse,keyboard;
	int screen, ram;
	String os;
	public static void main(String[] args) {
		
	//obj 1
	Comp comp1=new Comp();
    comp1.mouse=true;
    comp1.keyboard=true;
    comp1.screen=2;
    comp1.ram=8;
    comp1.os="Windows";
    comp1.watchMovie();
    comp1.doJavaCode();
    comp1.playMusic();
    //obj2
    System.out.println();
    System.out.println("Second object-----------------------");
   System.out.println();
    Comp comp2=new Comp();
    comp2.mouse=false;
    comp2.keyboard=false;
    comp2.screen=4;
    comp2.ram=6;
    comp2.os="Mac OS";
    comp2.watchMovie();
    comp2.doJavaCode();
    comp2.playMusic();
     //obj2
	}
	void watchMovie() {
		System.out.println("We can watch movie on a computer");
	}
	void doJavaCode() {
		System.out.println("We can do coding on our computer");
	}
	void playMusic() {
		System.out.println("We can play music on our computer");
	}
}