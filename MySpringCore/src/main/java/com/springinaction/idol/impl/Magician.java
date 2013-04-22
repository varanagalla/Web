/**
 * 
 */
package com.springinaction.idol.impl;

import com.springinaction.idol.MindReader;

/**
 * @author Sysadmin
 *
 */
public class Magician implements MindReader {

	private String thoughts;
	private Integer value;
	/* (non-Javadoc)
	 * @see com.springinaction.idol.MindReader#interceptThoughts(java.lang.String)
	 */
	@Override
	public void interceptThoughts(String thoughts) {
		System.out.println("Intercepting volunteer's thoughts.");
		this.thoughts = thoughts;
	}

	/* (non-Javadoc)
	 * @see com.springinaction.idol.MindReader#getThoughts()
	 */
	@Override
	public String getThoughts() {
		return thoughts;
	}

	@Override
	public void interceptAny(String thoughts, Integer value) {
		this.thoughts = thoughts;
		this.value = value;
	}

	@Override
	public Integer getValue() {
		return value;
	}
	
	

}
