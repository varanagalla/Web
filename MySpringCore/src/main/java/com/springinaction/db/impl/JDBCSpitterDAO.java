/**
 * 
 */
package com.springinaction.db.impl;

import static com.springinaction.constants.ApplicationConstants.SQL_INSERT_SPITTER;
import static com.springinaction.constants.ApplicationConstants.SQL_SELECT_SPITTER;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springinaction.bo.Spitter;

import com.springinaction.db.SpitterDAO;

/**
 * @author Sysadmin
 *
 */
public class JDBCSpitterDAO extends NamedParameterJdbcDaoSupport implements SpitterDAO
{
	
	//private NamedParameterJdbcTemplate npJdbcTemplate;
	
	public JDBCSpitterDAO()
	{
		
	}
	

	/**
	 * @return the jdbcTemplate
	 *//*
	public JdbcTemplate getJdbcTemplate() {
		return npJdbcTemplate;
	}*/

	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 *//*
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.npJdbcTemplate = jdbcTemplate;
	}*/
	
	
	public void addSpitter(Spitter spitter)
	{
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", spitter.getId());
		paramMap.put("userName", spitter.getUserName());
		paramMap.put("password", spitter.getPassword());
		paramMap.put("fullName", spitter.getFullName());
		//npJdbcTemplate.update(SQL_INSERT_SPITTER, paramMap);
		getNamedParameterJdbcTemplate().update(SQL_INSERT_SPITTER, paramMap);
	}
	
	public Spitter getSpitterById(Integer id)
	{
		Map<String,Object> paramMap = new HashMap<String, Object>();
		paramMap.put("id", id);
		
		return getNamedParameterJdbcTemplate().queryForObject(SQL_SELECT_SPITTER, paramMap, new ParameterizedRowMapper<Spitter>(){

			@Override
			public Spitter mapRow(ResultSet rs, int arg1) throws SQLException {
				Spitter spitter = new Spitter();
				spitter.setId(rs.getInt("ID"));
				spitter.setUserName(rs.getString("USERNAME"));
				spitter.setPassword(rs.getString("PASSWORD"));
				spitter.setFullName(rs.getString("FULLNAME"));
				return spitter;
			}});
	}
	
}
