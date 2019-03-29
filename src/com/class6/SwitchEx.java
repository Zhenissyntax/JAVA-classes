package com.class6;
import java.util.Scanner;
public class SwitchEx {
	
	
   public static void main(String[] args) {
	        
	     

	        
	        
	        Scanner scan;
	        String country;
	        String language;
	        
	        scan=new Scanner(System.in);
	        System.out.println("Please enter which country you are from");
	        country=scan.nextLine();
	        
	        switch (country) {
	        
	        case "USA":
	            language="English";
	            break;
	        case "Afghanistan":
	            language="Pashtu";
	            break;
	        case "Russia":
	            language="Russian";
	            break;
	        case "Italy":
	            language="Italian";
	            break;
	        case "Turkey":
	            language="Turkish";
	            break;
	        case "Morocco":
	            language="Arab";
	            break;
	        case "Kazakhstan":
	            language="Kazakh";
	            break;
	        
	        default:
	            language="Unknown";
	        }
	        System.out.println("Your language is  "+language);
	    }
	}
	