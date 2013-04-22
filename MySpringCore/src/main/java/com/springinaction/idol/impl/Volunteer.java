/**
 * 
 */
package com.springinaction.idol.impl;

import com.springinaction.idol.Thinker;

/**
 * @author Sysadmin
 *
 */
public class Volunteer implements Thinker {

	private String thoughts;
	
	/* (non-Javadoc)
	 * @see com.springinaction.idol.Thinker#thinkOfSomething(java.lang.String)
	 */
	@Override
	public void thinkOfSomething(String thoughts) {
		this.thoughts = thoughts;
	}
	
	
	
	
	public String getThoughts()
	{
		return thoughts;
	}




	@Override
	public void thinkOfAny(String thoughts, Integer value) {
		this.thoughts = thoughts;
	}
}
