/**
 * 
 */
package com.gof.dp.impl;

import com.gof.dp.DrawAPI;

/**
 * @author Sysadmin
 *
 */
public abstract class Shape implements Cloneable{
	
	private String id;
	protected String type;
	public abstract void draw();
	protected DrawAPI drawAPI;
	
	public Shape(){
		
	}
	
	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	
	public Object clone(){
		Object cloned = null;
		try{
			cloned = super.clone();
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return cloned;
	}
	

}
