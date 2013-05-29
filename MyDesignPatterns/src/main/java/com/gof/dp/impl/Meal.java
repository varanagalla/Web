/**
 * 
 */
package com.gof.dp.impl;

import java.util.ArrayList;
import java.util.List;

import com.gof.dp.Item;

/**
 * @author Sysadmin
 *
 */
public class Meal {
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public float getCost(){
		float cost = 0.0f;
		if(!items.isEmpty()){
			for(Item item : items){
				cost += item.price();
			}
		}
		
		return cost;
	}
	
	public void showItems(){
		if(!items.isEmpty()){
			for(Item item : items){
				System.out.print("Name : "+item.name());
				System.out.print("Packing : "+item.pack().pack());
				System.out.println("Price : "+item.price());
			}
		}
	}
}
