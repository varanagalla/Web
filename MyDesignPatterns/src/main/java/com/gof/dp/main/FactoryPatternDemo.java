/**
 * 
 */
package com.gof.dp.main;

import com.gof.dp.IShape;
import com.gof.dp.ShapeFactory;
import com.gof.dp.constants.ShapeType;

/**
 * @author Sysadmin
 *
 */
public class FactoryPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		
		IShape shape = shapeFactory.getShape(ShapeType.Rectangle.toString());
		shape.draw();
		
		shape = shapeFactory.getShape(ShapeType.Square.toString());
		shape.draw();
		
		shape = shapeFactory.getShape(ShapeType.Circle.toString());
		shape.draw();
		
	}

}
