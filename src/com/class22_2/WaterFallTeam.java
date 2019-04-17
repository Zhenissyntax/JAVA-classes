package com.class22_2;
import com.class22.*;
public class WaterFallTeam extends Employee{
		public static void main(String[] args) {
			WaterFallTeam wt=new WaterFallTeam();
			wt.salary1=90000; // can access protected values from different package through inheritance
			//wt.salary; //default values cannot be access in different package
			wt.test();// available cuz its protected
			//wt.test1();//NOT available because its default
		}
	}

