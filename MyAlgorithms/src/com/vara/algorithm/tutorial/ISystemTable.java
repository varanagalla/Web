/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public interface ISystemTable {
	void put(Key key, Value value);
	Value get(Key key);
	void delete(Key key);
	int height();
	int height(Node node);
	int size();
	int size(Node node);
	void deleteMin();
	void deleteMax();
	Key min();
	Key max();
	Key floor(Key key);
	Key ceiling(Key key);
}
