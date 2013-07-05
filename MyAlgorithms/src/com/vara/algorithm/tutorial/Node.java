/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public class Node {
	private Key key;
	private Value val;
	private Node left;
	private Node right;
	private int count;
	
	public Node(Key key, Value value){
		this.key = key;
		this.val = value;
	}
	
	
	
	/**
	 * @param val the val to set
	 */
	public void setVal(Value val) {
		this.val = val;
	}



	/**
	 * @return the key
	 */
	public Key getKey() {
		return key;
	}
	/**
	 * @return the val
	 */
	public Value getVal() {
		return val;
	}
	/**
	 * @return the left
	 */
	public Node getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(Node left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public Node getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(Node right) {
		this.right = right;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
}
