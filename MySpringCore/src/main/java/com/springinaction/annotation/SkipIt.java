/**
 * 
 */
package com.springinaction.annotation;


/**
 * @author Sysadmin
 *
 */
public @interface SkipIt {

	String value() default "Test";

}
