package com.designpattern.strategy;

/**
 * The Class PremiumPricingStrategy.
 * 
 * @author Durga Prasad
 */
public class PremiumPricingStrategy implements PricingStrategy {

	/* (non-Javadoc)
	 * @see com.designpattern.strategy.PricingStrategy#price()
	 */
	@Override
	public void price() {
		System.out.println("Premium pricing in process and this will be applied");
	}

}
