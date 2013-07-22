/**
 * 
 */
package com.gof.dp;

import java.util.List;

import com.gof.domain.Person;

/**
 * @author Sysadmin
 *
 */
public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
