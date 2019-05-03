package com.class32;

public abstract class CreditCard {
	public String creditCardName;
	public CreditCard(String creditCardName) {
		this.creditCardName=creditCardName;
	}
	public void openAccaount() {
		System.out.println("Open "+creditCardName+" credit card");
	}
    public abstract void  interestRate();
    public abstract void annualFee();
}

class Visa extends CreditCard{
  public Visa(String creditCardName) {
	  super(creditCardName);
  }
	@Override
	public void interestRate() {
		System.out.println(creditCardName+" card has interest rate of 25" );
		// TODO Auto-generated method stub
		
	}

	@Override
	public void annualFee() {
		System.out.println(creditCardName+" card has annual fee of $200");
		// TODO Auto-generated method stub
		
	}
	
}

class MasterCard extends CreditCard{
	  public MasterCard(String creditCardName) {
		  super(creditCardName);
	  }
		@Override
		public void interestRate() {
			System.out.println(creditCardName+" card has interest rate of 20%" );
			// TODO Auto-generated method stub
			
		}

		@Override
		public void annualFee() {
			System.out.println(creditCardName+" card has annual fee of $200");
			// TODO Auto-generated method stub
			
		}
		
	}

class AmericanExpress extends CreditCard{
	  public AmericanExpress(String creditCardName) {
		  super(creditCardName);
	  }
		@Override
		public void interestRate() {
			System.out.println(creditCardName+" card has interest rate of 20%" );
			// TODO Auto-generated method stub
			
		}

		@Override
		public void annualFee() {
			System.out.println(creditCardName+" card has NO annual fee ");
			// TODO Auto-generated method stub
			
		}
		
	}