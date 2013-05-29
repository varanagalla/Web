/**
 * 
 */
package com.gof.dp;

import com.gof.dp.constants.ShapeType;
import com.gof.dp.impl.Circle;
import com.gof.dp.impl.Rectangle;
import com.gof.dp.impl.Square;

/**
 * @author Sysadmin
 *
 */
public class ShapeFactory extends IAbstractFactory{
	
	/**
	 * This method gets the Shape object based on shape type.
	 * @param shapeType
	 * @return
	 */
	public IShape getShape(String shapeType){
		IShape shape = null;
		if(shapeType == null)
		{
			shape = null;
		}
		else if(shapeType.equalsIgnoreCase(ShapeType.Rectangle.toString())){
			shape = new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase(ShapeType.Square.toString())){
			shape = new Square();
		}
		else if(shapeType.equalsIgnoreCase(ShapeType.Circle.toString())){
			shape = new Circle();
		}
		else{
			shape = null;
		}
		return shape;
	}

	@Override
	public IColor getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}
}
