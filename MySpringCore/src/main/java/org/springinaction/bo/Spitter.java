/**
 * 
 */
package org.springinaction.bo;

/**
 * @author Sysadmin
 *
 */
public class Spitter 
{
	private Integer id;
	private String userName;
	private String password;
	private String fullName;
	
	public Spitter()
	{
		
	}
	
	public Spitter(Integer id,String userName,String password)
	{
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	@Override
	public String toString()
	{
		StringBuffer spitter = new StringBuffer();
		spitter.append("ID:").append(id).append(",");
		spitter.append("USERNAME:").append(userName).append(",");
		spitter.append("PASSWORD:").append(password).append(",");
		spitter.append("FULL NAME:").append(fullName);
		return spitter.toString();
	}
	
}
