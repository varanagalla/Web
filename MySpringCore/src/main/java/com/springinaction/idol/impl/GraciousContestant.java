/**
 * 
 */
package com.springinaction.idol.impl;

import com.springinaction.idol.Contestant;

/**
 * @author Sysadmin
 *
 */
public class GraciousContestant implements Contestant {

	/* (non-Javadoc)
	 * @see com.springinaction.idol.Contestant#receiveAward()
	 */
	@Override
	public void receiveAward() {
		System.out.println("I got award.");
	}

}
