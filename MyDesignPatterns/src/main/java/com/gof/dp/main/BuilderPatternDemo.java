/**
 * 
 */
package com.gof.dp.main;

import com.gof.dp.impl.Meal;
import com.gof.dp.impl.MealBuilder;

/**
 * @author Sysadmin
 *
 */
public class BuilderPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();
		Meal vegMeal = builder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("Total cost (Veg Meal): " + vegMeal.getCost());
		
		Meal nonVegMeal = builder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("Total cost (Non-Veg Meal): " + nonVegMeal.getCost());
	}

}
