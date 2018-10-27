package com.designpattern.observer;

/**
 * An asynchronous update interface for receiving notifications
 * about ISensex information as the ISensex is constructed.
 * 
 * 
 * @author Durga Prasad
 */
public interface ISensexObserver {
	
	/**
	 * This method is called when information about an ISensex
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 *
	 * @param index the index
	 */
	public void updateSensexIndex(long index);
	
	/**
	 * This method is called when information about an ISensex
	 * which was previously requested using an asynchronous
	 * interface becomes available.
	 *
	 * @param index the index
	 */
	static void showIndex(long index){
		System.out.println(index);
	}

}
