
package com.class32;

import java.util.ArrayList;
import java.util.Iterator;

public class CreditCardTest{
	
	public static void main(String[] args) {
		Visa visa=new Visa("Visa Platinum");
		AmericanExpress ax=new AmericanExpress("AX rewards");
		MasterCard mc=new MasterCard("MC basic");
		ArrayList<CreditCard> alist=new ArrayList<>();
		alist.add(visa);
		alist.add(ax);
		alist.add(mc);
		//how can i get a name cof each card?
		for(CreditCard card:alist) {
			System.out.println(card.creditCardName);
			card.interestRate();
			card.annualFee();
		}
		//how can we print and interest rate of each card
		Iterator<CreditCard>myIterator=alist.iterator();
		while(myIterator.hasNext()) {
		CreditCard obj=	myIterator.next();
		obj.interestRate();
		
		}
		//how to print an annual fee of each card
		for (int i=0; i<alist.size(); i++) {
			CreditCard obj=alist.get(i);
			obj.annualFee();
		}
	}
	
}