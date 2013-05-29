/**
 * 
 */
package com.gof.dp.impl;

/**
 * @author Sysadmin
 *
 */
public class SingleObject {
	
	private SingleObject(){
		
	}
	
	private static class SingletonFactory{
		static SingleObject object = new SingleObject();
	}
	
	public static SingleObject getInstance(){
		return SingletonFactory.object;
	}
	
	public void showMessage(String message){
		System.out.println(message);
	}
}
