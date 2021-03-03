/**
 * 
 */
package com.grv786.omnicell;

import java.util.Arrays;

/**
 * @author grv78
 *
 */
public class Cabinet {
	Bin[] smallBin;
	Bin[] mediumBin;
	Bin[] largeBin;
	
	private final int SMALL = 5;
	private final int MEDIUM = 3;
	private final int LARGE = 2;
	/**
	 * @param smallBin
	 * @param mediumBin
	 * @param largeBin
	 */
	public Cabinet() {
		this.smallBin = new SmallBin[SMALL];
		this.mediumBin = new MediumBin[MEDIUM];
		this.largeBin = new LargeBin[LARGE];
	}
	
	public void fillCabinet() {
		fillSmallBinsInCabinet();
		fillMediumBinsInCabinet();
		fillLargeBinsInCabinet();
	}
	
	public void fillSmallBinsInCabinet() {
		for (int i = 0; i < smallBin.length; i++) {
			System.out.println("Initializing Small Bin - " + (i + 1));
			smallBin[i] = new SmallBin();
			System.out.println();
		}
	}
	
	public void fillMediumBinsInCabinet() {		
		for (int i = 0; i < mediumBin.length; i++) {
			System.out.println("Initializing Medium Bin - " + (i + 1));
			mediumBin[i] = new MediumBin();
			System.out.println();
		}
	}
	
	public void fillLargeBinsInCabinet() {
		for (int i = 0; i < largeBin.length; i++) {
			System.out.println("Initializing Large Bin - " + (i + 1));
			largeBin[i] = new LargeBin();
			System.out.println();
		}
	}
	
	public void firstSmallBinOverflow() {
		fillSmallBinsInCabinet();
		System.out.println(Arrays.toString(smallBin));
		smallBin[0].addUnit(new Unit(100, "SmallBin Medication - " + 100));
	}
	
	public void firstMediumBinOverflow() {
		fillMediumBinsInCabinet();
		System.out.println(Arrays.toString(mediumBin));
		mediumBin[0].addUnit(new Unit(100, "MediumBin Medication - " + 100));
	}
	
	public void firstLargeBinOverflow() {
		fillLargeBinsInCabinet();
		System.out.println(Arrays.toString(largeBin));
		largeBin[0].addUnit(new Unit(100, "LargeBin Medication - " + 100));
	}
	
	public void removeFromFirstSmallBin() {
		smallBin[0].removeUnit(new Unit(3, "SmallBin Medication - 3"));
		System.out.println(smallBin[0]);
	}
	
	@Override
	public String toString() {
		return "Cabinet [smallBin=" + Arrays.toString(smallBin) + ", mediumBin=" + Arrays.toString(mediumBin)
				+ ", largeBin=" + Arrays.toString(largeBin) + "]";
	}
	
	
	

}
