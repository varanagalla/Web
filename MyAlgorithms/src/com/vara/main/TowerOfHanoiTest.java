/**
 * 
 */
package com.vara.main;
import com.vara.core.RecursiveTowerOfHanoi;
import com.vara.core.TowerOfHanoi;


/**
 * @author vpsrini
 *
 */
public class TowerOfHanoiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TowerOfHanoi towerOfHanoi = new RecursiveTowerOfHanoi(5,'A','B','C');
		towerOfHanoi.solve();
	}

}
