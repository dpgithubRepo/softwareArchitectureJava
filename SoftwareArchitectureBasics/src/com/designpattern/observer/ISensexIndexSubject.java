package com.designpattern.observer;

/**
 * The Interface ISensexIndexSubject.
 * 
 * @author Durga Prasad
 */
public interface ISensexIndexSubject {

	/**
	 * Adds the observer.
	 *
	 * @param sensexObserver the sensex observer
	 */
	public void addObserver(ISensexObserver sensexObserver);
	
	/**
	 * Removes the observer.
	 *
	 * @param sensexObserver the sensex observer
	 */
	public void removeObserver(ISensexObserver sensexObserver);
	
	/**
	 * Notify observers.
	 */
	public void notifyObservers();
}
