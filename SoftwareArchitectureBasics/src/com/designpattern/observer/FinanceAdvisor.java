package com.designpattern.observer;

/**
 * The Class FinanceAdvisor.
 * 
 * @author Durga Prasad
 */
public class FinanceAdvisor implements ISensexObserver {

	/* (non-Javadoc)
	 * @see com.designpattern.observer.ISensexObserver#updateSensexIndex(long)
	 */
	@Override
	public void updateSensexIndex(long index) {
		System.out.println("Finance Advisor Notified");
		ISensexObserver.showIndex(index);
	}

}
