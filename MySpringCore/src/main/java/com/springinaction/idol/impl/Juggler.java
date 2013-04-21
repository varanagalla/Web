/**
 * 
 */
package com.springinaction.idol.impl;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springinaction.idol.Performer;

/**
 * @author Sysadmin
 *
 */
@Component("duke")
public class Juggler implements Performer {
	
	private int beanbags = 3;
	
	public Juggler()
	{
		
	}
	
	@Autowired(required=false)
	public Juggler(@Value("#{settings['bean.bags']}")int beanbags)
	{
		this.beanbags = beanbags;
	}
	
	@PostConstruct
	public void init()
	{
		System.out.println(this.getClass().getName() + " initialized successfully.");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println(this.getClass().getName() + " destroyed successfully.");
	}
	
	/* (non-Javadoc)
	 * @see com.springinaction.idol.Performer#perform()
	 */
	@Override
	public void perform() throws Exception {
		System.out.println("JUGGLING "+beanbags + " BEANBAGS.");
	}

	/**
	 * @return the beanbags
	 */
	public int getBeanbags() {
		return beanbags;
	}

	/**
	 * @param beanbags the beanbags to set
	 */
	public void setBeanbags(int beanbags) {
		this.beanbags = beanbags;
	}

}
