package com.designpattern.strategy;

public class App {
	
	public static void main(String[] args) {
		
		PenetrationPricingStrategy pPricingStrategy = new PenetrationPricingStrategy();
		EconomyPricingStrategy ePricingStrategy = new EconomyPricingStrategy();
		PremiumPricingStrategy premPricingStrategy = new PremiumPricingStrategy();
		
		PricingContext context = new PricingContext();
		context.setPricingStrategy(pPricingStrategy);
		context.doPricing();
		
		
		context.setPricingStrategy(ePricingStrategy);
		context.doPricing();
		
		
		context.setPricingStrategy(premPricingStrategy);
		context.doPricing();
	}

}
