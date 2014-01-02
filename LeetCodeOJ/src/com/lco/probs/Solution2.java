/**
 * 
 */
package com.lco.probs;

import java.util.HashMap;
import java.util.Map;


 // Definition for a point.
class Point {
     int x;
     int y;
     Point() { x = 0; y = 0; }
     Point(int a, int b) { x = a; y = b; }
 }

/**
 * @author vpsrini
 *
 */
public class Solution2 {
	
	public int maxPoints(Point[] points) {
        int result = 0;
        int nPoints = points.length;
        int delX = 0;
        int delY = 0;
        int gcd;
        Map<String, Integer> maxCountMap;
        StringBuilder sb = new StringBuilder();
        String key = null;
        
        if(points.length <= 2){
        	return points.length;
        }
        
        for(int i=0; i < nPoints; i++){
        	int max = 0;
        	// Should be 1 to include starting point in the iteration.
        	int dups = 1;
        	maxCountMap = new HashMap<String, Integer>();
    		for(int j=(i+1); j < nPoints; j++){
    			//deltaX
        		delX = points[i].x - points[j].x;
        		//deltaY
        		delY = points[i].y - points[j].y;
        		gcd = this.gcd(delX, delY);
        		
        		if(gcd == 0){
        			dups ++;
        			continue;
        		}
        		// Rationalize deltas to avoid floating errors.
        		delX /= gcd;
        		delY /= gcd;
        		sb.delete(0, sb.length());
        		sb.append(delY).append("-->").append(delX);
        		key = sb.toString();
        		if(!maxCountMap.containsKey(key)){
        			maxCountMap.put(key, 0);
        		}
        		maxCountMap.put(key, maxCountMap.get(key).intValue() + 1);
        		max = this.max(max, maxCountMap.get(key).intValue());         	
        	}
    		//Adding duplicates if any.
        	result = this.max(result, max + dups);
        	maxCountMap.clear();
        }
        return result;
    }
	
	private int gcd(int a, int b){
		return (a == 0)? b:gcd(b%a,a);
	}
	
	private int max(int a, int b){
		return (a > b) ? a : b;
	}

}
