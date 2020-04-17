package com.norha.spring;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class User {
	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("Beans.xml");
		BikeInsurance status = context.getBean("myInsurance",BikeInsurance.class);
		System.out.println(status.showStatus());
		System.out.println("Currnet Offer : "+status.getCurrentOffer().getOffer());
		System.out.println("Trems and Condtions : "+status.getCurrentCondition().getCondition());
		context.close();
	}
}
