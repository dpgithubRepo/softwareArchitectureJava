package com.designpattern.strategy;

/**
 * The Class EconomyPricingStrategy.
 * 
 * @author Durga Prasad
 */
public class EconomyPricingStrategy implements PricingStrategy {

	/* (non-Javadoc)
	 * @see com.designpattern.strategy.PricingStrategy#price()
	 */
	@Override
	public void price() {
		System.out.println("Economy  pricing in process and this will be applied");
	}

}
