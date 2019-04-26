package com.class28;

public interface Bank {
	//BY DEFAULT COMPILER ADD PUBLIC & ABSTRACT TO EVERY METHOD
	
	 
	
	void hasChecking();    //INTERFACE CAN HAVE ONLY UNDIFINED METHODS
	void hasSavings();
	void hasCreditCard();
                                    //By default it will be public static final variables;
	//WE cannot have instance variables 
	//We cannot have STATIC methods
	//Interface-set of rules, plan, everything is abstract
	//Interface 100% ABSTRACT
	//Constructor PROHIBITED in Interface
	//We cannot create an Object of a Constructor
}
class BOA implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("BOA has 2 cheking acc");
	} 

	@Override
	public void hasSavings() {
		System.out.println("BOA has 2 saving acc");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("BOA has 10 diff acc");
		// TODO Auto-generated method stub
		
	}
	
}
class PNC implements Bank{

	@Override
	public void hasChecking() {
		System.out.println("PNC has 3 checking acc");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasSavings() {
		System.out.println("PNC has  3 sabings acc");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hasCreditCard() {
		System.out.println("PNC has 7 different cc");
		// TODO Auto-generated method stub
		
	}
	
}
