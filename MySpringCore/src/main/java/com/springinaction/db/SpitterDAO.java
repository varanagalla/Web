/**
 * 
 */
package com.springinaction.db;

import org.springinaction.bo.Spitter;

/**
 * @author Sysadmin
 *
 */
public interface SpitterDAO
{
	//void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate);
	void addSpitter(Spitter spitter);
	Spitter getSpitterById(Integer id);
}
