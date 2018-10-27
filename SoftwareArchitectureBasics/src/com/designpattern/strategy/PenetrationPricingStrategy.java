package com.designpattern.strategy;

public class PenetrationPricingStrategy implements PricingStrategy {

	@Override
	public void price() {
		System.out.println("Penetration pricing in process and this will be applied");
	}

}
