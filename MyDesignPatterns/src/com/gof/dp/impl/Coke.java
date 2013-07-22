/**
 * 
 */
package com.gof.dp.impl;

/**
 * @author Sysadmin
 *
 */
public class Coke extends ColdDrink {

	/* (non-Javadoc)
	 * @see com.gof.dp.impl.ColdDrink#price()
	 */
	@Override
	public float price() {
		return 15.0f;
	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "Coke";
	}

}
