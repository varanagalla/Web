/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.DrawAPI;
import com.gof.dp.IShape;

/**
 * @author Sysadmin
 *
 */
public class Circle extends Shape implements IShape {

	private int radius;
	private int x;
	private int y;
	
	public Circle(){
		this.type = "Circle";
	}
	
	public Circle(int x, int y, int radius, DrawAPI drawAPI){
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	/* (non-Javadoc)
	 * @see com.gof.dp.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside Circle:: draw() method.");
		drawAPI.drawCircle(radius, x, y);
	}

}
