/**
 * 
 */
package com.grv786.omnicell;

/**
 * @author grv78
 *
 */
public class MediumBin extends BinImpl {

	/**
	 * 
	 */
	public MediumBin() {
		super();
		maxCapacity = 10;
		
		for(int i = 0; i < maxCapacity; i++) {
			addUnit(new Unit(i + 1, "MediumBin Medication - " + (i + 1)));
		}
	}
	
	public MediumBin(int count) {
		super();
		maxCapacity = 10;
		
		for(int i = 0; i < count; i++) {
			addUnit(new Unit(i + 1, "MediumBin Medication - " + (i + 1)));
		}
	}

	@Override
	public String toString() {
		return "MediumBin [maxCapacity=" + maxCapacity + ", unitList=" + unitList + "]";
	}

}
