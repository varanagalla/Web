/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.IShape;

/**
 * @author Sysadmin
 *
 */
public class Square extends Shape implements IShape {
	
	public Square(){
		this.type = "Square";
	}

	/* (non-Javadoc)
	 * @see com.gof.dp.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
