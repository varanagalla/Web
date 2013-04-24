/**
 * 
 */
package com.springinaction.constants;

/**
 * @author Sysadmin
 *
 */
public interface ApplicationConstants 
{
	public static final String SQL_INSERT_SPITTER = "insert into spitter(ID,USERNAME,PASSWORD,FULLNAME) values (:id,:userName,:password,:fullName)";
	public static final String SQL_SELECT_SPITTER = "select * from spitter where id = :id";
}