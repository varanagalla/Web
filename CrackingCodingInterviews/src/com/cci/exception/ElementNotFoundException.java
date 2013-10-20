/**
 * 
 */
package com.cci.exception;

/**
 * @author vpsrini
 *
 */
public class ElementNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4128860980810588237L;
	
	public ElementNotFoundException(){
		super();
	}
	
	public ElementNotFoundException(String message){
		super(message);
	}
	
	public ElementNotFoundException(Throwable throwable){
		super(throwable);
	}
	
}
