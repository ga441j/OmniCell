package com.grv786.omnicell;

public class SmallBin extends BinImpl {

	/**
	 * 
	 */
	public SmallBin() {
		super();
		maxCapacity = 5;
		
		for(int i = 0; i < maxCapacity; i++) {
			addUnit(new Unit(i + 1, "SmallBin Medication - " + (i + 1)));
		}
	}

	@Override
	public String toString() {
		return "SmallBin [maxCapacity=" + maxCapacity + ", unitList=" + unitList + "]";
	}

}
