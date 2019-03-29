package com.class11;
public class ArraysTwoD{
	public static void main(String[] args) {
		int [][] d=new int[4][4];
		d[0][0]=12;
		d[0][1]=13;
		d[0][2]=14;
		d[0][3]=15;
		
		//2 row
		d[1][0]=1;
		d[1][1]=2;
		d[1][2]=3;
		d[1][3]=4;
		//3 row
		d[2][0]=5;
		d[2][1]=10;
		d[2][2]=15;
		d[2][3]=20;
		
		System.out.println(d[1][2]);
		System.out.println(d[2][2]);
		
		int [][] c = { 
				{12,13,14,15},
				{1,2,3,4},
				{5,10,15,20},
				{100,200,300,400}
			
		};
		for (int row=0; row<4;row++) {
			for (int col=0; col<3;col++) {
				
			 System.out.print(c[row][col]+" ");
		}System.out.println();
		}
	
		String[][] groups= {
                {"Andrei","Artem","Julia","Zoya"},
                {"Bilal","Shaban","Asmit","Sasha","Olga","Moe"},
                };
System.out.println(groups[0][1]+" "+ groups[1][2]);
	
	
	String [][] names={
		{"Mr","Mrs","Ms","Miss"},
		{"Smith","Jordan","Jackson", "Obama"}
	};
	System.out.println(names[0][0]+" "+names[1][0]+ " "+names[0][1]+" "+names[1][1]+" "+names[0][2]+" "+names[1][2]+" "+names[0][3]+" "+names[1][3]);
	
	String [][] student= {
			{"John","James","Smith","Jack"},
			{"A","B","C","D"}
			
	};
	System.out.println(student[0][0]+ " is grade "+ student[1][0]);
	System.out.println(student[0][2]+" is grade "+student[1][1]);
	
	}
}