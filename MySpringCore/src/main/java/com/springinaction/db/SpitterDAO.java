/**
 * 
 */
package com.springinaction.db;

import com.springinaction.hibernate.mapping.Spitter;

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
