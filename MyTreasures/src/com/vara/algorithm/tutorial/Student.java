/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author vpsrini
 *
 */
public class Student {
	
	private String name;
	private int sec;
	
	public Student(String name, int sec){
		this.name = name;
		this.sec = sec;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int key() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	
	
}
