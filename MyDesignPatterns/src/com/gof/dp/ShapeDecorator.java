/**
 * 
 */
package com.gof.dp;

/**
 * @author Sysadmin
 *
 */
public abstract class ShapeDecorator implements IShape {

	protected IShape decoratedShape;
	
	public ShapeDecorator(IShape decoratedShape){
		this.decoratedShape = decoratedShape;
	}
	
	/* (non-Javadoc)
	 * @see com.gof.dp.IShape#draw()
	 */
	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
