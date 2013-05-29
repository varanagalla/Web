/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.IShape;

/**
 * @author Sysadmin
 *
 */
public class Rectangle extends Shape implements IShape {

	public Rectangle(){
		this.type = "Rectangle";
	}
	
	/* (non-Javadoc)
	 * @see com.gof.dp.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
