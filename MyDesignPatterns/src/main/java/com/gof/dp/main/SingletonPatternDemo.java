/**
 * 
 */
package com.gof.dp.main;

import com.gof.dp.impl.SingleObject;

/**
 * @author Sysadmin
 *
 */
public class SingletonPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage("Hello World!!!");
	}

}
