/**
 * 
 */
package com.springinaction.idol.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.springinaction.idol.Poem;

/**
 * @author Sysadmin
 *
 */
@Component("pj")
public class PoeticJuggler extends Juggler
{
	Poem poem = null;
	
	public PoeticJuggler()
	{
		super();
	}
	
	@Autowired(required=false)
	public PoeticJuggler(@Value("#{settings['bean.bags']}")int beanBags, @Value("#{ddb}")Poem poem)
	{
		super(beanBags);
		this.poem = poem;
	}
	
	@Override
	public void perform() throws Exception
	{
		super.perform();
		System.out.println("While reciting.....");
		poem.recite();
		
	}
}
