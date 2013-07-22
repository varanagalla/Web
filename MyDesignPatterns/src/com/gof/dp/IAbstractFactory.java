/**
 * 
 */
package com.gof.dp;

/**
 * @author Sysadmin
 *
 */
public abstract class IAbstractFactory {
	public abstract IColor getColor(String colorType);
	public abstract IShape getShape(String shapeType);
}
