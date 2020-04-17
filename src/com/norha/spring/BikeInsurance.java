package com.norha.spring;


public class BikeInsurance implements Insurance {
	private Offers offers;
	public BikeInsurance(Offers o) {
		this.offers=o;
		System.out.println(this.offers.getOffer());
	}

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}

	
}
