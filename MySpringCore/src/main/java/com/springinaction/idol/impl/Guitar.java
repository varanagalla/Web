/**
 * 
 */
package com.springinaction.idol.impl;

import org.springframework.stereotype.Component;

import com.springinaction.idol.Instrument;

/**
 * @author Sysadmin
 *
 */
@Component
public class Guitar implements Instrument {

	/* (non-Javadoc)
	 * @see com.springinaction.idol.Instrument#play()
	 */
	@Override
	public void play() {
		System.out.println("strum strum strum");
	}

}
