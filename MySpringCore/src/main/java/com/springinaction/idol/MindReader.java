/**
 * 
 */
package com.springinaction.idol;

/**
 * @author Sysadmin
 *
 */
public interface MindReader {
	
	void interceptThoughts(String thoughts);
	void interceptAny(String thoughts,Integer value);
	String getThoughts();
	Integer getValue();
}
