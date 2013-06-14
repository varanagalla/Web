/**
 * 
 */
package com.vara.main;

import com.vara.core.IVaraArray;
import com.vara.core.VaraArray;

/**
 * @author vpsrini
 *
 */
public class Test {
	
	public static void main(String[] args){
		
		//Duplicates  OK;
		IVaraArray varaArr = new VaraArray();
		varaArr.insert(10);
		varaArr.insert(23);
		varaArr.insert(17);
		varaArr.insert(23);
		
		//delete element.
		varaArr.delete(23);
		varaArr.insert(16);
		varaArr.insert(2);
		varaArr.insert(60);
		varaArr.insert(9);
		varaArr.insert(1);
		
		System.out.println("Before sort...");
		varaArr.display();
		varaArr.applySort();
		System.out.println("After sort.....");
		varaArr.display();
	}

}
