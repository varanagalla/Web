/**
 * 
 */
package com.vara.main;

/**
 * @author vpsrini
 *
 */
public class MiscTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(recXPowerY(2,8));
	}
	
	
	private static int recXPowerY(int x, int y){
		if(y == 0){
			return 1;
		}
		else if(y == 1){
			return x;
		}
		else{
			//If y is odd add additional multiplication of x to the result.
			if(y%2 > 0){
				return x * recXPowerY(x*x,y/2);
			}
			else{
				return recXPowerY(x*x,y/2);
			}
		}
	}

}