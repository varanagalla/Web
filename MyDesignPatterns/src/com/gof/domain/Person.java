/**
 * 
 */
package com.gof.domain;

/**
 * @author Sysadmin
 *
 */
public class Person {
	private String name;
	private String gender;
	private String maritalStatus;
	
	public Person(String name, String gender, String maritalStatus){
		this.name = name;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the maritalStatus
	 */
	public String getMaritalStatus() {
		return maritalStatus;
	}

	/**
	 * @param maritalStatus the maritalStatus to set
	 */
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
}
