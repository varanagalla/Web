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
@Component("sonnet29")
public class Sonic29 implements Poem {
	
	String[] lines = new String[]
			{
				"Vara and Sri are good friends",
				"Vara and Sri became partners on Sep 2nd 2011",
				"They came to US on Jan 01 2011",
				"They moved to California in Nov 2012",
				"They are currently in Crystal Springs Terrace Apartments"
			};

	/* (non-Javadoc)
	 * @see com.springinaction.idol.Poem#recite()
	 */
	@Override
	public void recite() 
	{
		for(String line : lines)
		{
			System.out.println(line);
		}

	}

}
