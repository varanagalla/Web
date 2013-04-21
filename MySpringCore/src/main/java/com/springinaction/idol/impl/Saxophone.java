/**
 * 
 */
package com.springinaction.idol.impl;

import com.springinaction.idol.Instrument;

/**
 * @author Sysadmin
 *
 */
public class Saxophone implements Instrument {

	/* (non-Javadoc)
	 * @see com.springinaction.idol.Instrument#play()
	 */
	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
