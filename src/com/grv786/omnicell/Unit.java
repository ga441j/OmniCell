/**
 * 
 */
package com.grv786.omnicell;

import java.util.Objects;

/**
 * @author grv78
 *
 */
public class Unit {
	private int medicineId;
	private String medicineName;

	public Unit(int medicineId, String medicineName) {
		this.medicineId = medicineId;
		this.medicineName = medicineName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(medicineId, medicineName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Unit)) {
			return false;
		}
		Unit other = (Unit) obj;
		return medicineId == other.medicineId && Objects.equals(medicineName, other.medicineName);
	}
	
	@Override
	public String toString() {
		return "Unit [medicineId=" + medicineId + ", medicineName=" + medicineName + "]";
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

}
