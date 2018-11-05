package com.designpattern.template;

// TODO: Auto-generated Javadoc
/**
 * The Class SpecialAdjustmentBond.
 * 
 * @author Durga Prasad
 */
public class SpecialAdjustmentBond extends ProductDebtIssuance{

	/* (non-Javadoc)
	 * @see com.designpattern.template.ProductDebtIssuance#createIssuance()
	 */
	@Override
	void createIssuance() {
		System.out.println("Special Adjustment Bond creation in process....");
	}

	/* (non-Javadoc)
	 * @see com.designpattern.template.ProductDebtIssuance#tradeIssuance()
	 */
	@Override
	void tradeIssuance() {
		System.out.println("Special Adjustment Bond Trading in process....");		
	}

	/* (non-Javadoc)
	 * @see com.designpattern.template.ProductDebtIssuance#matureIssuance()
	 */
	@Override
	void matureIssuance(){
		
		double interest = 15;
		System.out.println("Special Adjustment Bond Maturity Logic- interest rate will be "+ interest);
		
	}
}
