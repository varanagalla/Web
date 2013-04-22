/**
 * 
 */
package com.springinaction.idol.misc;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Sysadmin
 *
 */
@Aspect
public class Audience {
	
	@Pointcut("execution (* com.springinaction.idol.Performer.perform(..))")
	public void performance()
	{
		
	}
	
	@Before("performance()")
	public void takeSeats()
	{
		System.out.println("The audience is taking their seats.");
	}
	
	@Before("performance()")
	public void turnOffCellPhones()
	{
		System.out.println("The audience is turning off their cell phones.");
	}
	
	@AfterReturning("performance()")
	public void applaud()
	{
		System.out.println("CLAP CLAP CLAP CLAP");
	}
	@AfterThrowing("performance()")
	public void demandRefund()
	{
		System.out.println("Boo! We want our money back.");
	}
	
}
