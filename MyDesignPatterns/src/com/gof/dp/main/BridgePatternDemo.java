/**
 * 
 */
package com.gof.dp.main;

import com.gof.dp.impl.Circle;
import com.gof.dp.impl.GreenCircle;
import com.gof.dp.impl.RedCircle;
import com.gof.dp.impl.Shape;

/**
 * @author Sysadmin
 *
 */
public class BridgePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
