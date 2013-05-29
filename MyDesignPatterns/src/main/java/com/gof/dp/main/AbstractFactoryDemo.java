/**
 * 
 */
package com.gof.dp.main;

import com.gof.dp.IAbstractFactory;
import com.gof.dp.IColor;
import com.gof.dp.IShape;
import com.gof.dp.constants.ColorType;
import com.gof.dp.constants.FactoryType;
import com.gof.dp.constants.ShapeType;
import com.gof.dp.impl.FactoryProducer;

/**
 * @author Sysadmin
 *
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IAbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryType.Shape.toString());
		
		IShape shape = shapeFactory.getShape(ShapeType.Rectangle.toString());
		shape.draw();
		
		IAbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.Color.toString());
		
		IColor color = colorFactory.getColor(ColorType.Red.toString());
		color.fill();
	}

}
