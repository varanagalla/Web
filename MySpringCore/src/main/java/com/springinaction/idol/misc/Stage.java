/**
 * 
 */
package com.springinaction.idol.misc;

import org.springframework.stereotype.Component;

/**
 * @author Sysadmin
 *
 */
@Component("theStage")
public class Stage 
{
	
	private Stage()
	{
		
	}
	
	public void testStage()
	{
		System.out.println("This is factory created bean!!!");
	}
	
	private static class StageHolder
	{
		static Stage instance = new Stage();
	}
	
	
	public static Stage getInstance()
	{
		return StageHolder.instance;
	}
	
}
