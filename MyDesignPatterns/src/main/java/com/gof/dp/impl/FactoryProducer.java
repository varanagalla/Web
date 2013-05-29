/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.IAbstractFactory;
import com.gof.dp.ColorFactory;
import com.gof.dp.ShapeFactory;
import com.gof.dp.constants.FactoryType;

/**
 * @author Sysadmin
 *
 */
public class FactoryProducer {
	public static IAbstractFactory getFactory(String factoryType){
		IAbstractFactory factory = null;
		if(factoryType == null){
			factory = null;
		}
		else if(factoryType.equalsIgnoreCase(FactoryType.Shape.toString())){
			factory = new ShapeFactory();
		}
		else if(factoryType.equalsIgnoreCase(FactoryType.Color.toString())){
			factory = new ColorFactory();
		}
		else{
			factory = null;
		}
		
		return factory;
	}
}
