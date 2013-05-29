/**
 * 
 */
package com.gof.dp.main;

import com.gof.dp.impl.Shape;
import com.gof.dp.impl.ShapeCache;

/**
 * @author Sysadmin
 *
 */
public class PrototypePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape : "+clonedShape.getType());
		
		clonedShape = ShapeCache.getShape("2");
		System.out.println("Shape : "+clonedShape.getType());
		
		
		clonedShape = ShapeCache.getShape("3");
		System.out.println("Shape : "+clonedShape.getType());
	}

}
