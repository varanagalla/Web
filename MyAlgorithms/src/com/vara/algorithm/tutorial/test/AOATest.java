/**
 * 
 */
package com.vara.algorithm.tutorial.test;

import com.vara.algorithm.tutorial.AOA;


/**
 * @author VaraPrasad_Nagalla
 *
 */
public class AOATest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*int[] input = new int[]{100000,200000,400000,800000,1600000,3200000,6400000,12800000,2560000,5120000,10240000};
		long timeElapsed = 0;
		long prevTimeElapsed = 0;
		double ratio = 1;
		StopWatch stopWatch = new StopWatch();
		for(int n : input){
			System.out.println("*******************************************************");
			stopWatch.start();
			AOA.anonymous(n);
			stopWatch.stop();
			timeElapsed = stopWatch.getElapsedTime();
			if(prevTimeElapsed > 0){
				ratio = Math.floor(timeElapsed/prevTimeElapsed) ;
			}
			System.out.println("N = "+n + "\t" + "Time Ratio : " + ratio + "\t" + "Time Elapsed : "+timeElapsed);
			prevTimeElapsed = timeElapsed;
			System.out.println("*******************************************************");
		}*/
		
		int[] x = new int[]{1,6,8,10};
		int[] y = new int[]{2,5,9,11};
		
		System.out.println("****************************************************************************");
		AOA.displayElements(x, y);
		System.out.println();
		
		x = new int[]{1,2,3,4,5};
		y = new int[]{6,7,8,9,10};
		
		System.out.println("****************************************************************************");
		AOA.displayElements(x, y);
		
	}

}
