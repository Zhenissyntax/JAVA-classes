package com.class6;
import java.util.Scanner;
class dca {
  public static void main(String[] args) {
    int num;
    String season="";
    Scanner sc= new Scanner (System.in);
    System.out.println("Please enter your birthday month number ");
    num=sc.nextInt();
    if  (num==12||num==1||num==2) {
      season="Winter";
    }else if (num==3||num==4||num==5) {
     season="Spring";
    } else if (num==6||num==7||num==8) {
      season="Summer";
    } else if (num==9||num==10||num==11) {
      season = "Fall";
    }else { 
      season="Unknown";
      System.out.println("Please enter valid month number " + season);}
        System.out.println("You were born in " +season);
    }
}