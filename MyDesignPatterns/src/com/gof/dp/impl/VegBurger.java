/**
 * 
 */
package com.gof.dp.impl;

/**
 * @author Sysadmin
 *
 */
public class VegBurger extends Burger {

	/* (non-Javadoc)
	 * @see com.gof.dp.impl.Burger#price()
	 */
	@Override
	public float price() {
		return 25.0f;
	}

	@Override
	public String name() {
		return "Veg Burger";
	}

}
