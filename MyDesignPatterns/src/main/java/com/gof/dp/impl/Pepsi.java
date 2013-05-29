/**
 * 
 */
package com.gof.dp.impl;

/**
 * @author Sysadmin
 *
 */
public class Pepsi extends ColdDrink {

	/* (non-Javadoc)
	 * @see com.gof.dp.impl.ColdDrink#name()
	 */
	@Override
	public String name() {
		return "Pepsi";
	}

	/* (non-Javadoc)
	 * @see com.gof.dp.impl.ColdDrink#price()
	 */
	@Override
	public float price() {
		return 15.0f;
	}

}
