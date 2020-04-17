package com.norha.spring;


public class BikeInsurance implements Insurance {
	private Conditions currentCondition;
	private Offers currentOffer;
	
	public Conditions getCurrentCondition() {
		return currentCondition;
	}

	public void setCurrentCondition(Conditions c) {
		this.currentCondition = c;
	}

	public Offers getCurrentOffer() {
		return currentOffer;
	}

	public void setCurrentOffer(Offers o) {
		this.currentOffer = o;
	}

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}

	
}
