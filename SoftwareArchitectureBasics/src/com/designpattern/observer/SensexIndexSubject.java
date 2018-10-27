package com.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class SensexIndexSubject.
 * 
 * @author Durga Prasad
 */
public class SensexIndexSubject implements ISensexIndexSubject {
	
	//maintains list of observers which are subscribed to this subject
	/** The brokerage firms. */
	private List<ISensexObserver> brokerageFirms;
	
	/** The sensex index. */
	private Integer sensexIndex;
	
	
	/**
	 * Gets the sensex index.
	 *
	 * @return the sensex index
	 */
	public Integer getSensexIndex() {
		return sensexIndex;
	}

	/**
	 * Sets the sensex index.
	 *
	 * @param sensexIndex the new sensex index
	 */
	public void setSensexIndex(Integer sensexIndex) {
		this.sensexIndex = sensexIndex;
		
		if(sensexIndex%2 != 0){
			notifyObservers();
		}
	}

	/**
	 * Instantiates a new sensex index subject.
	 */
	public SensexIndexSubject(){
		brokerageFirms= new ArrayList<>();
	}

	/* (non-Javadoc)
	 * @see com.designpattern.observer.ISensexIndexSubject#addObserver(com.designpattern.observer.ISensexObserver)
	 */
	@Override
	public void addObserver(ISensexObserver sensexObserver) {
		brokerageFirms.add(sensexObserver);

	}

	/* (non-Javadoc)
	 * @see com.designpattern.observer.ISensexIndexSubject#removeObserver(com.designpattern.observer.ISensexObserver)
	 */
	@Override
	public void removeObserver(ISensexObserver sensexObserver) {
		brokerageFirms.remove(sensexObserver);

	}

	/* (non-Javadoc)
	 * @see com.designpattern.observer.ISensexIndexSubject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		
		for(ISensexObserver observer: brokerageFirms){
			observer.updateSensexIndex(sensexIndex);
		}

	}

}
