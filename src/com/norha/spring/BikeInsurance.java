package com.norha.spring;


public class BikeInsurance implements Insurance {
	
	public BikeInsurance() {
	}
	
	public BikeInsurance(Offers o) {
		System.out.println(o.getOffer());
	}

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}

	
}
