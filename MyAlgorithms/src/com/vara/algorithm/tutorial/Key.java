/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public class Key implements Comparable<Key> {
	
	private Integer key;
	
	public Key(Integer key){
		this.key = key;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Key o) {
		return this.key.compareTo(o.key);
	}

	/**
	 * @return the key
	 */
	public Integer getKey() {
		return key;
	}

}
