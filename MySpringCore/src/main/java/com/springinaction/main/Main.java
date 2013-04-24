/**
 * 
 */
package com.springinaction.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springinaction.bo.Spitter;

import com.springinaction.db.SpitterDAO;
import com.springinaction.idol.Contestant;
import com.springinaction.idol.MindReader;
import com.springinaction.idol.Performer;
import com.springinaction.idol.Thinker;
import com.springinaction.idol.misc.Stage;

/**
 * @author Vara
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
		
		((Contestant)performer).receiveAward();
		
		Thinker thinker = (Thinker) ctx.getBean("volunteer");
		thinker.thinkOfAny("Vara's Any thoughts",45);
		thinker.thinkOfSomething("Vara's Thought.");
		
		MindReader mindReader = (MindReader) ctx.getBean("magician");
		System.out.println(mindReader.getThoughts());
		System.out.println(mindReader.getValue());
		
		Spitter spitter = new Spitter();
		spitter.setId(4);
		spitter.setUserName("sri.5685");
		spitter.setPassword("Rampu");
		spitter.setFullName("Srividya Kondru");
		
		SpitterDAO spitterDAO = (SpitterDAO) ctx.getBean("jdbcSpitterDAO");
		spitterDAO.addSpitter(spitter);
		System.out.println(spitterDAO.getSpitterById(2));
		
	}
	
}
