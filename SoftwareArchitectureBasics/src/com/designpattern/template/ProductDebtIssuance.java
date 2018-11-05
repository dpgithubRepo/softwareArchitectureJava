package com.designpattern.template;

/**
 * The Class ProductDebtIssuance.
 * 
 * @author Durga Prasad
 */
public abstract class ProductDebtIssuance {
	
	/** The interest. */
	double interest = 8.0;
	
	
	//Template method
	/**
	 * Full fill issuance.
	 */
	void fullFillIssuance(){
		createIssuance();
		tradeIssuance();
		matureIssuance();
	}
	
	//The following two methods has to be implemented in the solid child class
	/**
	 * Creates the issuance.
	 */
	abstract void createIssuance();
	
	/**
	 * Trade issuance.
	 */
	abstract void tradeIssuance();
	
	
	// default implementation
	//hook method
	/**
	 * Mature issuance.
	 */
	void matureIssuance(){
		System.out.println("Product level Maturity Logic- interest rate will be "+ interest);
	}
	

}
