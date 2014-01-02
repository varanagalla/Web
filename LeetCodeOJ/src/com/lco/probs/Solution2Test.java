/**
 * 
 */
package com.lco.probs;



/**
 * @author vpsrini
 *
 */
public class Solution2Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2 solution2 = new Solution2();
		Point[] points = new Point[]{new Point(0,-12),new Point(5,2),new Point(2,5),new Point(0,-5),new Point(1,5),new Point(2,-2),new Point(5,-4),new Point(3,4),new Point(-2,4),new Point(-1,4),new Point(0,-5),new Point(0,-8),new Point(-2,-1),new Point(0,-11),new Point(0,-9)};
				//new Point[]{new Point(0,0), new Point(1,1), new Point(0,0)};
				//new Point[]{ new Point(2,3), new Point(2,3), new Point(2,3) };
				//new Point[]{new Point(2,3), new Point(2,4), new Point(2,9)};//new Point(0,0), new Point(1,1), new Point(1,-1)};//, new Point(2,7)};//, new Point(2,2), new Point(4,4), new Point(2,4), new Point(2,5), new Point(6,9)};
		System.out.println("Max Points :: " + solution2.maxPoints(points));

	}

}
