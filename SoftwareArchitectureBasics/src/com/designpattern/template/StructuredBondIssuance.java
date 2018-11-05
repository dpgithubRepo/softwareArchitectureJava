package com.designpattern.template;

/**
 * The Class StructuredBondIssuance.
 * 
 * @author Durga Prasad
 */
public class StructuredBondIssuance extends ProductDebtIssuance {

	/* (non-Javadoc)
	 * @see com.designpattern.template.ProductDebtIssuance#createIssuance()
	 */
	@Override
	void createIssuance() {
		System.out.println("Structured Bond Creation in process.......");
	}

	/* (non-Javadoc)
	 * @see com.designpattern.template.ProductDebtIssuance#tradeIssuance()
	 */
	@Override
	void tradeIssuance() {
		System.out.println("Structured Bond trade in process.......");
	}
	
  //maturity logic is dependent on the product level hook method

}
