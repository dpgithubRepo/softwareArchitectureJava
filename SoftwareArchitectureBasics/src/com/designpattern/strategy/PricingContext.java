package com.designpattern.strategy;

public class PricingContext {
	
	PricingStrategy pricingStrategy;
	
	public PricingContext(){}
	
	public void setPricingStrategy(PricingStrategy pricingStrategy) {
		this.pricingStrategy = pricingStrategy;
	}


	public PricingContext(PricingStrategy pricingStrategy){
		this.pricingStrategy = pricingStrategy;
	}
	
	
	public void doPricing(){
		pricingStrategy.price();
	}

}
