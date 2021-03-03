/**
 * 
 */
package com.grv786.omnicell;

/**
 * @author grv78
 *
 */
public class LargeBin extends BinImpl {

	/**
	 * 
	 */
	public LargeBin() {
		super();
		maxCapacity = 15;
		
		for(int i = 0; i < maxCapacity; i++) {
			addUnit(new Unit(i + 1, "LargeBin Medication - " + (i + 1)));
		}
	}
	
	public LargeBin(int count) {
		super();
		maxCapacity = 15;
		
		for(int i = 0; i < count; i++) {
			addUnit(new Unit(i + 1, "LargeBin Medication - " + (i + 1)));
		}
	}

	@Override
	public String toString() {
		return "LargeBin [maxCapacity=" + maxCapacity + ", unitList=" + unitList + "]";
	}
}
