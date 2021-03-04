/**
 * 
 */
package com.grv786.omnicell;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author grv78
 *
 */
public class Cabinet {
	Bin[] smallBin;
	Bin[] mediumBin;
	Bin[] largeBin;
	
	List<TrackingRecord> trackingInfo;
	
	private final int SMALL = 3;
	private final int MEDIUM = 5;
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
		this.trackingInfo = new ArrayList<TrackingRecord>();
	}
	
	@Override
	public String toString() {
		return "Cabinet [smallBin=" + Arrays.toString(smallBin) + ", mediumBin=" + Arrays.toString(mediumBin)
				+ ", largeBin=" + Arrays.toString(largeBin) + ", trackingInfo=" + trackingInfo + "]";
	}
	
	// Following set of Methods are to run Test scenarios Only.
	
	public void fillCabinet() {
		fillSmallBinsInCabinet();
		fillMediumBinsInCabinet();
		fillLargeBinsInCabinet();
	}
	
	public void fillSmallBinsInCabinet() {
		for (int index = 0; index < smallBin.length; index++) {
			System.out.println("Initializing Small Bin - " + (index + 1));
			smallBin[index] = new SmallBin();
			TrackingRecord trackingRecord = new TrackingRecord("User1", "Small", index, 1, "Fill Bin", smallBin[index].getMaxCapacity());
			trackingInfo.add(trackingRecord);
			System.out.println();
		}
	}
	
	public void fillMediumBinsInCabinet() {		
		for (int index = 0; index < mediumBin.length; index++) {
			System.out.println("Initializing Medium Bin - " + (index + 1));
			mediumBin[index] = new MediumBin();
			TrackingRecord trackingRecord = new TrackingRecord("User1", "Medium", index, 1, "Fill Bin", mediumBin[index].getMaxCapacity());
			trackingInfo.add(trackingRecord);
			System.out.println();
		}
	}
	
	public void fillLargeBinsInCabinet() {
		for (int index = 0; index < largeBin.length; index++) {
			System.out.println("Initializing Large Bin - " + (index + 1));
			largeBin[index] = new LargeBin();
			TrackingRecord trackingRecord = new TrackingRecord("User1", "Large", index, 1, "Fill Bin", largeBin[index].getMaxCapacity());
			trackingInfo.add(trackingRecord);
			System.out.println();
		}
	}
	
	public void firstSmallBinOverflow() {
		fillSmallBinsInCabinet();
		System.out.println(Arrays.toString(smallBin));
		smallBin[0].addUnit(new Unit(100, "SmallBin Medication - " + 100));
		TrackingRecord trackingRecord = new TrackingRecord("User1", "Small", 1, 1, "Overflow Failed", 1);
		trackingInfo.add(trackingRecord);
	}
	
	public void firstMediumBinOverflow() {
		fillMediumBinsInCabinet();
		System.out.println(Arrays.toString(mediumBin));
		mediumBin[0].addUnit(new Unit(100, "MediumBin Medication - " + 100));
		TrackingRecord trackingRecord = new TrackingRecord("User2", "Medium", 1, 1, "Overflow Failed", 1);
		trackingInfo.add(trackingRecord);
	}
	
	public void firstLargeBinOverflow() {
		fillLargeBinsInCabinet();
		System.out.println(Arrays.toString(largeBin));
		largeBin[0].addUnit(new Unit(100, "LargeBin Medication - " + 100));
		TrackingRecord trackingRecord = new TrackingRecord("User2", "Large", 1, 1, "Overflow Failed", 1);
		trackingInfo.add(trackingRecord);
	}
	
	public void removeFromFirstSmallBin() {
		smallBin[0].removeUnit(new Unit(3, "SmallBin Medication - 3"));
		TrackingRecord trackingRecord = new TrackingRecord("User2", "Small", 1, 1, "Remove Unit", 1);
		trackingInfo.add(trackingRecord);
		System.out.println(smallBin[0]);
	}
	
	public void alertLessThan20Percent() {
		smallBin[0].resetUnit();
		TrackingRecord trackingRecord = new TrackingRecord("User3", "Small", 1, 1, "Reset Unit", smallBin[0].getMaxCapacity());
		trackingInfo.add(trackingRecord);

		System.out.println("Initializing Small Bin - 1");
		smallBin[0] = new SmallBin(2);
		trackingRecord = new TrackingRecord("User3", "Small", 1, 1, "Add Unit", 2);
		trackingInfo.add(trackingRecord);
		System.out.println();
		
		smallBin[0].removeUnit(new Unit(2, "SmallBin Medication - 2"));
		trackingRecord = new TrackingRecord("User3", "Small", 1, 1, "Remove Unit", 1);
		trackingInfo.add(trackingRecord);
		System.out.println(smallBin[0]);
	}
	
}
