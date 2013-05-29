/**
 * 
 */
package com.gof.dp;

import com.gof.dp.constants.ColorType;
import com.gof.dp.impl.Blue;
import com.gof.dp.impl.Green;
import com.gof.dp.impl.Red;

/**
 * @author Sysadmin
 *
 */
public class ColorFactory extends IAbstractFactory {

	/* (non-Javadoc)
	 * @see com.gof.dp.AbstractFactory#getColor(java.lang.String)
	 */
	@Override
	public IColor getColor(String colorType) {
		IColor color  = null;
		if(colorType == null){
			
		}
		else if(colorType.equalsIgnoreCase(ColorType.Red.toString())){
			color = new Red();
		}
		else if(colorType.equalsIgnoreCase(ColorType.Green.toString())){
			color = new Green();
		}
		else if(colorType.equalsIgnoreCase(ColorType.Blue.toString())){
			color = new Blue();
		}
		else{
			color = null;
		}
		
		return color;
	}

	/* (non-Javadoc)
	 * @see com.gof.dp.AbstractFactory#getShape(java.lang.String)
	 */
	@Override
	public IShape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
