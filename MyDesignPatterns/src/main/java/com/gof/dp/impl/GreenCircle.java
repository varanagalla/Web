/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.DrawAPI;

/**
 * @author Sysadmin
 *
 */
public class GreenCircle implements DrawAPI {

	/* (non-Javadoc)
	 * @see com.gof.dp.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle [color: Green , radius: "+radius+" x:"+x + " y:"+y);
	}

}
