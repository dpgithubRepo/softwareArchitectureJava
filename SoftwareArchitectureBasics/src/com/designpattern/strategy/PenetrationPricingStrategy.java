package com.designpattern.strategy;

/**
 * The Class PenetrationPricingStrategy.
 * 
 * @author Durga Prasad
 */
public class PenetrationPricingStrategy implements PricingStrategy {

	/* (non-Javadoc)
	 * @see com.designpattern.strategy.PricingStrategy#price()
	 */
	@Override
	public void price() {
		System.out.println("Penetration pricing in process and this will be applied");
	}

}
