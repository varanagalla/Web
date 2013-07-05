/**
 * 
 */
package com.vara.algorithm.tutorial;


/**
 * @author VaraPrasad_Nagalla
 *
 */
public class AOA {
	
	public static void anonymous(int N){
		@SuppressWarnings("unused")
		int sum = 0;
		for (int i = 1; i < N; i *= 2)
		for (int j = 0; j < N; j++)
		sum++;
		
	}
	
	
	
	
	/*int sum = 0;
	for(int n = N ; n > 0; n /= 2){
		for(int i = 0; i < n; i++){
			sum ++;
		}
	}*/
	
	/*int sum = 0;
	for (int i = 1; i < N; i *= 2)
		for (int j = 0; j < i; j++)
		sum++;*/
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public static void displayElements(int[] x, int[] y){
		int i=0;
		int j=0;
		int higher = y[j];
		int n = x.length;
		
		while(i < n){
			if(x[i] < higher){
				System.out.print(x[i] + "\t");
				i++;
			}else{
				System.out.print(higher + "\t");
				j++;
				higher = y[j];
			}
		}
		
		//display remaining elements.
		while(j < n){
			System.out.print(y[j] + "\t");
			j++;
		}
	}
	
}
