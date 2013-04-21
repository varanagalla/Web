/**
 * 
 */
package com.springinaction.idol.impl;

import com.springinaction.annotation.SkipIt;
import com.springinaction.idol.Instrument;

/**
 * @author Sysadmin
 *
 */
@SkipIt
public class Piano implements Instrument {

	/* (non-Javadoc)
	 * @see com.springinaction.idol.Instrument#play()
	 */
	@Override
	public void play() {
		System.out.println("PLINK PLINK PLINK");
	}

}
