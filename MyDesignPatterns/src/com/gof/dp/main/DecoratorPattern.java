/**
 * 
 */
package com.gof.dp.main;

import com.gof.dp.IShape;
import com.gof.dp.impl.Circle;
import com.gof.dp.impl.RedShapeDecorator;

/**
 * @author Sysadmin
 *
 */
public class DecoratorPattern {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Circle with normal border...");
		
		IShape redCircle = new RedShapeDecorator(circle);
		redCircle.draw();
	}

}
