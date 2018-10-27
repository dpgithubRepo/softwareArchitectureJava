package com.designpattern.observer;

/**
 * The Class SensexTrendAlerter.
 * 
 * @author Durga Prasad
 */
public class SensexTrendAlerter implements ISensexObserver {

	/* (non-Javadoc)
	 * @see com.designpattern.observer.ISensexObserver#updateSensexIndex(long)
	 */
	@Override
	public void updateSensexIndex(long index) {
		System.out.println("SensexTrendAlerter updated with the index");
		ISensexObserver.showIndex(index);

	}

}
