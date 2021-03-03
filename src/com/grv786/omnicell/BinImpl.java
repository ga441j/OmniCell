/**
 * 
 */
package com.grv786.omnicell;

import java.util.ArrayList;
import java.util.List;

/**
 * @author grv78
 *
 */
public class BinImpl implements Bin {

	protected int maxCapacity = 0;
	protected List<Unit> unitList = new ArrayList<Unit>();
	

	@Override
	public void addUnit(Unit unit) {
		if (unitList.size() < maxCapacity) {
			unitList.add(unit);
			System.out.println("Unit added in " + this.getClass().getSimpleName() + ": " + unit);
		} else {
			System.out.println(this.getClass().getSimpleName() + " has reached its maximum capacity.");
		}

	}

	@Override
	public void removeUnit(Unit u) {
		if (unitList.size() > 0) {
			unitList.remove(u);
			System.out.println("Unit removed from " + this.getClass().getSimpleName() + ": " + u);
		} else {
			System.out.println("No unit available to remove from " + this.getClass().getSimpleName());
			return;
		}
		if (unitList.size() <= ((int) Math.round(maxCapacity * 0.2))) {
			System.out.println("ALERT: " + this.getClass().getSimpleName() + " is running low on capacity !!!");
		}
	}

	@Override
	public void resetUnit(Unit u) {
		unitList.clear();
		System.out.println("Reset has be completed on " + this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return unitList.toString();
	}

}
