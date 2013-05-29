/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.IShape;
import com.gof.dp.ShapeDecorator;

/**
 * @author Sysadmin
 *
 */
public class RedShapeDecorator extends ShapeDecorator {

	public RedShapeDecorator(IShape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw(){
		this.decoratedShape.draw();
		this.setBorder(decoratedShape);
	}
	
	private void setBorder(IShape decoratedShape){
		System.out.println("Border color : Red");
	}

}
