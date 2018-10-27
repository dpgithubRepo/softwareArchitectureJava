package com.designpattern.strategy;

/**
 * The Class PricingContext.
 * 
 * @author Durga Prasad
 */
public class PricingContext {
	
	/** The pricing strategy. */
	PricingStrategy pricingStrategy;
	
	/**
	 * Instantiates a new pricing context.
	 */
	public PricingContext(){}
	
	/**
	 * Sets the pricing strategy.
	 *
	 * @param pricingStrategy the new pricing strategy
	 */
	public void setPricingStrategy(PricingStrategy pricingStrategy) {
		this.pricingStrategy = pricingStrategy;
	}


	/**
	 * Instantiates a new pricing context.
	 *
	 * @param pricingStrategy the pricing strategy
	 */
	public PricingContext(PricingStrategy pricingStrategy){
		this.pricingStrategy = pricingStrategy;
	}
	
	
	/**
	 * Do pricing.
	 */
	public void doPricing(){
		pricingStrategy.price();
	}

}
