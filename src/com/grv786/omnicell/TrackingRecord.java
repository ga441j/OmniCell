/**
 * 
 */
package com.grv786.omnicell;

import java.sql.Timestamp;

/**
 * @author grv78
 *
 */
public class TrackingRecord {
	private String user;
	private String dateTime;
	private String binSize;
	private int binNumber;
	private int medicationId;
	private String operation;      //Add, Remove, Reset
	private int unitCount;
	
	/**
	 * @param user
	 * @param date
	 * @param binSize
	 * @param binNumber
	 * @param medicationId
	 * @param operation
	 * @param unitCount
	 */
	public TrackingRecord(String user, String binSize, int binNumber, int medicationId,
			String operation, int unitCount) {
		super();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		this.user = user;
		this.dateTime = timestamp.toString();
		this.binSize = binSize;
		this.binNumber = binNumber;
		this.medicationId = medicationId;
		this.operation = operation;
		this.unitCount = unitCount;
	}
	
	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}
	/**
	 * @param binSize the binSize to set
	 */
	public void setBinSize(String binSize) {
		this.binSize = binSize;
	}
	/**
	 * @param binNumber the binNumber to set
	 */
	public void setBinNumber(int binNumber) {
		this.binNumber = binNumber;
	}
	/**
	 * @param medicationId the medicationId to set
	 */
	public void setMedicationId(int medicationId) {
		this.medicationId = medicationId;
	}
	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}
	/**
	 * @param unitCount the unitCount to set
	 */
	public void setUnitCount(int unitCount) {
		this.unitCount = unitCount;
	}

	@Override
	public String toString() {
		return "TrackingRecord [user=" + user + ", dateTime=" + dateTime + ", binSize=" + binSize + ", binNumber="
				+ binNumber + ", medicationId=" + medicationId + ", operation=" + operation + ", unitCount=" + unitCount
				+ "]";
	}
	
}
