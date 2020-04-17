package com.norha.spring;

import java.util.List;

public class BikeInsurance implements Insurance {
	
	public BikeInsurance(List<String> members) {
		System.out.println("LIST OF MEMBERS");
		for (String member : members) {
			System.out.println(member);
		}
	}

	@Override
	public String showStatus() {
		return "Your Bike is Insured";
	}

}
