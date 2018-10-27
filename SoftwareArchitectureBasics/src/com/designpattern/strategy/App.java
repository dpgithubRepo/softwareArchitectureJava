package com.designpattern.strategy;

/**
 * The Class App.
 */
public class App {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 * 
	 * @author Durga Prasad
	 */
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
