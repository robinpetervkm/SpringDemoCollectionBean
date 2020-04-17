package com.norha.spring;

import java.util.Set;

public class BikeInsurance implements Insurance {
	
	public BikeInsurance(Set<String> members) {
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
