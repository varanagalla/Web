/**
 * 
 */
package com.gof.dp.impl;

import java.util.Hashtable;

/**
 * @author Sysadmin
 *
 */
public class ShapeCache {
	
	private static Hashtable<String, Shape> cache = new Hashtable<String, Shape>(5,0.7f);
	
	public static void loadCache(){
		//Rectangle
		Rectangle rectangle = new Rectangle();
		rectangle.setId("1");
		cache.put(rectangle.getId(), rectangle);
		
		//Square
		Square square = new Square();
		square.setId("2");
		cache.put(square.getId(), square);
		
		//Circle
		Circle circle = new Circle();
		circle.setId("3");
		cache.put(circle.getId(), circle);
	}
	
	public static Shape getShape(String id){
		Shape shape = cache.get(id);
		return (Shape)shape.clone();
	}

}
