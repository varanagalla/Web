/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.Item;
import com.gof.dp.IPacking;

/**
 * @author Sysadmin
 *
 */
public abstract class Burger implements Item {

	/* (non-Javadoc)
	 * @see com.gof.dp.Item#name()
	 */
	@Override
	public abstract String name();

	/* (non-Javadoc)
	 * @see com.gof.dp.Item#pack()
	 */
	@Override
	public IPacking pack() {
		return new Wrapper();
	}

	/* (non-Javadoc)
	 * @see com.gof.dp.Item#price()
	 */
	@Override
	public abstract float price() ;

}
