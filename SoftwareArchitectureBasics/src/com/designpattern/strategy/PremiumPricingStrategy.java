package com.designpattern.strategy;

public class PremiumPricingStrategy implements PricingStrategy {

	@Override
	public void price() {
		System.out.println("Premium pricing in process and this will be applied");
	}

}
