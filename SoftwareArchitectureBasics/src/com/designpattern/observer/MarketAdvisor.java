package com.designpattern.observer;

/**
 * The Class MarketAdvisor.
 * 
 * @author Durga Prasad
 */
public class MarketAdvisor implements ISensexObserver {

	/* (non-Javadoc)
	 * @see com.designpattern.observer.ISensexObserver#updateSensexIndex(long)
	 */
	@Override
	public void updateSensexIndex(long index) {
		System.out.println("Market Advisor Notified");
		ISensexObserver.showIndex(index);
	}

}
