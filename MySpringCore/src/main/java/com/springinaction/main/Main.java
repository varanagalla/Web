/**
 * 
 */
package com.springinaction.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springinaction.idol.Performer;
import com.springinaction.idol.misc.Stage;

/**
 * @author Sysadmin
 *
 */
public class Main 
{
	public static void main(String[] args) throws Exception
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/spring-beans.xml");
		Stage stage = (Stage)ctx.getBean("theStage");
		stage.testStage();
		
		Performer juggler1 = (Performer)ctx.getBean("duke");
		juggler1.perform();
		//((Juggler)juggler1).setBeanbags(30);
		
		//Performer juggler2 = (Performer)ctx.getBean("duke");
		
		//System.out.println("Juggle1 BeanBags -->> "+((Juggler)juggler1).getBeanbags() +" \t"+"Juggler2 BeanBags -->> "+((Juggler)juggler2).getBeanbags());*/
		
		Performer performer = (Performer) ctx.getBean("eddie");
		performer.perform();
		
		performer = (Performer) ctx.getBean("omb");
		performer.perform();
		
		performer = (Performer) ctx.getBean("pj");
		performer.perform();
		
		
	}
	
}
