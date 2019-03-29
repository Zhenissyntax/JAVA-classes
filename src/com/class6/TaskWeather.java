package com.class6;

import java.util.Scanner;

public class TaskWeather {
	public static void main(String[] args) {
		
		boolean snow; 
		boolean rain;
		boolean sunny;
		int temp;
		String activity=""; 
		Scanner sc=new Scanner (System.in);
		System.out.println("Please enter the temperatue");
		temp=sc.nextInt();
		if (temp>=40 && temp<=80) {
			System.out.println("is it raining?");
			rain=sc.nextBoolean();
			if (rain) {
		     activity="watch a movie";
			} else {
				activity="go hiking";
			}
		} else if (temp>=25 && temp<40 ) {
			System.out.println("is it snowing?");
			snow=sc.nextBoolean();
			if(snow) {
				activity="snowboarding";
			} else {
				activity="Lets code";
			}
		
		
		} else  if (temp>80) {
					System.out.println("is it sunny?");
					sunny=sc.nextBoolean();
				 if (sunny)  {
					 activity="go to the beach";
				 }else {
					 activity = "do more coding";
				 }
		
	}else   {  
					System.out.println("Please enter different temperature");
	}
				
	               System.out.println("my activity for today "+ activity);
				}
			}


			
				
			
	
			
			
			
		