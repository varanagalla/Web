/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.IColor;

/**
 * @author Sysadmin
 *
 */
public class Blue implements IColor {

	/* (non-Javadoc)
	 * @see com.gof.dp.Color#fill()
	 */
	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

}
