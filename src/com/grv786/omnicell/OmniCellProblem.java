/**
 * 
 */
package com.grv786.omnicell;


/**
 * @author grv78
 *
 */
public class OmniCellProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cabinet cabinet = new Cabinet();
		
		cabinet.fillCabinet();
		System.out.println(cabinet);
		
		cabinet.firstSmallBinOverflow();
		cabinet.firstMediumBinOverflow();
		cabinet.firstLargeBinOverflow();

		System.out.println();
		cabinet.removeFromFirstSmallBin();
		
		System.out.println();
		cabinet.alertLessThan20Percent();
	}

}
