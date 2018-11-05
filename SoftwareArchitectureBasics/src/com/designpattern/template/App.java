package com.designpattern.template;

/**
 * The Class App.
 * 
 * @author Durga Prasad
 */
public class App {
	
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		ProductDebtIssuance structuredIssuance = new StructuredBondIssuance();
		structuredIssuance.fullFillIssuance();
		
		ProductDebtIssuance specialBond = new SpecialAdjustmentBond();
		specialBond.fullFillIssuance();
	}

}
