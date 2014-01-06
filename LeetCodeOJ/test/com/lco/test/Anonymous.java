/**
 * 
 */
package com.lco.test;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import com.lco.probs.WordBreak;

/**
 * @author vpsrini
 *
 */
public class Anonymous {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		/*BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));

		String input;
		
		System.out.println("Enter text :: ");
		System.out.print(">");

		input = br.readLine();
		
		if(input.matches("-?\\d+")){
			System.out.println("This is a number.");
		}else{
			System.out.println("This is not a number.");
		}*/
		
		//System.out.println(isUniqueChars("Srivdya"));
		
		int[] arr = new int[]{2,100,6,-1,0};
				//new int[]{10,9,8,7,6,5,4,3,2};//,1,0,1000,9,10};
		
		/*Solution6 sln = new Solution6();
		
				//new int[]{2,100,6,-1,0};
		int index = sln.findTopIndex(arr, 5);
		
		for(int i = index; i < arr.length; i++){
			System.out.print(arr[i]);
			System.out.print("\t");
		}*/
		
		/*Solution7 sln = new Solution7();
		sln.findMinMax(arr);*/
		
		String s = "IaVara";
		Set<String> dict = new HashSet<String>();
		dict.add("I");
		dict.add("a");
		dict.add("Vara");
		//dict.add("code");
		//dict.add("gs");
		//dict.add("code");
		//dict.add("Vara");
		
		WordBreak wb = new WordBreak();
		System.out.println(wb.wordBreak(s, dict));
		
	}
	
	public static boolean isUniqueChars(String str) {
	    int checker = 0;
	    for (int i = 0; i < str.length(); ++i) {
	        int val = str.charAt(i) - 'a';
	        if ((checker & (1 << val)) > 0) return false;
	        checker |= (1 << val);
	    }
	    return true;
	}

}
