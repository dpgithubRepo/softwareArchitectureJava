package com.designpattern.observer;

import java.util.Random;

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
		SensexIndexSubject subject = new SensexIndexSubject();
		
		FinanceAdvisor faBroker = new FinanceAdvisor();
		MarketAdvisor maBroker = new MarketAdvisor();
		SensexTrendAlerter staBroker = new  SensexTrendAlerter();
		
		
		subject.addObserver(faBroker);
		subject.addObserver(maBroker);
		subject.addObserver(staBroker);
		
		Random random = new Random();
		
		for(int i=0;i<20;i++){
			System.out.println("Setting new Index");
			System.out.println();
			subject.setSensexIndex(random.nextInt(40000));
		}
		
	}

}
