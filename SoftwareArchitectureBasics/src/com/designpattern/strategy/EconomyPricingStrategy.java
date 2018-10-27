package com.designpattern.strategy;

public class EconomyPricingStrategy implements PricingStrategy {

	@Override
	public void price() {
		System.out.println("Economy  pricing in process and this will be applied");
	}

}
