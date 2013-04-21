/**
 * 
 */
package com.springinaction.idol.impl;

import org.springframework.stereotype.Component;

import com.springinaction.idol.Poem;

/**
 * @author Sysadmin
 *
 */
@Component("ddb")
public class DingDongBell implements Poem {

	/* (non-Javadoc)
	 * @see com.springinaction.idol.Poem#recite()
	 */
	@Override
	public void recite() {
		System.out.println("Ding dong bell.");
	}

}
