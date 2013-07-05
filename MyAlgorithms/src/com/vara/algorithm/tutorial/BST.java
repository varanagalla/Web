/**
 * 
 */
package com.vara.algorithm.tutorial;

/**
 * @author VaraPrasad_Nagalla
 *
 */
public class BST implements ISystemTable {
	
	private Node root;
	
	private Node put(Node node, Key key, Value value){
		if(node == null){
			return new Node(key,value);
		}
		
		int cmp = node.getKey().compareTo(key);
		if(cmp < 0) {
			node.setLeft(this.put(node.getLeft(),key,value));
		}
		else if(cmp > 0) {
			node.setRight(this.put(node.getRight(),key,value));
		}
		else{
			node.setVal(value);
		}
		
		//Update node size up to the root level.
		node.setCount(1 + this.size(node.getLeft()) + this.size(node.getRight()));
		
		return node;
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#put(com.vara.algorithm.tutorial.Key, com.vara.algorithm.tutorial.Value)
	 */
	@Override
	public void put(Key key, Value value) {
		this.put(root, key, value);
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#get(com.vara.algorithm.tutorial.Key)
	 */
	@Override
	public Value get(Key key) {
		Node node = this.root;
		//Non-Recursive implementation.
		/*while(node != null){
			int cmp = node.getKey().compareTo(key);
			if(cmp < 0){
				node = node.getLeft();
			}else if(cmp > 0){
				node = node.getRight();
			}else{
				return node.getVal();
			}
		}*/
		return this.get(node, key);
	}
	
	private Value get(Node node, Key key){
		if(node == null) return null;
		
		int cmp = node.getKey().compareTo(key);
		
		if(cmp < 0){
			return this.get(node.getLeft(), key);
		}else if(cmp > 0){
			return this.get(node.getRight(), key);
		}else{
			return node.getVal();
		}
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#delete(com.vara.algorithm.tutorial.Key)
	 */
	@Override
	public void delete(Key key) {
		this.root =  this.delete(this.root, key);
	}
	
	private Node delete(Node node, Key key){
		if(node == null){
			return null;
		}
		int cmp = node.getKey().compareTo(key);
		if(cmp < 0){
			node = this.delete(node.getLeft(),node.getKey());
		}else if(cmp > 0){
			node = this.delete(node.getRight(),node.getKey());
		}else{
			if(node.getRight() == null){
				return node.getLeft();
			}
			if(node.getLeft() == null){
				return node.getRight();
			}
			Node original = node;
			//Swap with its successor.
			node = min(original.getRight());
			
			node.setRight(this.deleteMin(original.getRight()));
			node.setLeft(original.getLeft());
			
		}
		node.setCount(1 + this.size(node.getLeft()) + this.size(node.getRight()));
		return node;
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#height()
	 */
	@Override
	public int height() {
		return this.height(root);
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#height(com.vara.algorithm.tutorial.Node)
	 */
	@Override
	public int height(Node node) {
		if(node == null){
			return 0;
		}else{
			return 1 + Math.max(this.height(node.getLeft()), this.height(node.getRight()));
		}
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#size()
	 */
	@Override
	public int size() {
		return this.size(this.root);
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#size(com.vara.algorithm.tutorial.Node)
	 */
	@Override
	public int size(Node node) {
		int size = 0;
		if(node != null){
			size = node.getCount();
		}
		return size;
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#deleteMin(com.vara.algorithm.tutorial.Node)
	 */
	@Override
	public void deleteMin() {
		this.root = this.deleteMin(this.root);
	}
	
	private Node deleteMin(Node node){
		if(node.getLeft() == null){
			return node.getRight();
		}else{
			node.setLeft(this.deleteMin(node));
		}
		
		node.setCount(1 + this.size(node.getLeft()) + this.size(node.getRight()));
		
		return node;
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#deleteMax(com.vara.algorithm.tutorial.Node)
	 */
	@Override
	public void deleteMax() {
		this.deleteMax(this.root);
	}
	
	private Node deleteMax(Node node){
		if(node.getRight() == null){
			return node.getLeft();
		}else{
			node.setRight(this.deleteMax(node.getRight()));
		}
		node.setCount(1 + this.size(node.getLeft()) + this.size(node.getRight()));
		return node;
	}

	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#min()
	 */
	@Override
	public Key min() {
		return this.min(root).getKey();
	}
	
	private Node min(Node node){
		if(node.getLeft() == null){
			return node;
		}else{
			return min(node.getLeft());
		}
	}
	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#floor(com.vara.algorithm.tutorial.Key)
	 */
	@Override
	public Key floor(Key key) {
		return this.floor(root, key).getKey();
	}
	
	private Node floor(Node node, Key key){
		if(node == null){
			return null;
		}
		int cmp = key.compareTo(node.getKey());
		if(cmp == 0){
			return node;
		}
		if(cmp < 0){
			return this.floor(node.getLeft(), key);
		}
		Node t = this.floor(node.getRight(), key);
		if(t != null){
			return t;
		}else{
			return node;
		}
	}
	
	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#ceiling(com.vara.algorithm.tutorial.Key)
	 */
	@Override
	public Key ceiling(Key key) {
		return this.ceiling(root, key).getKey();
	}
	
	private Node ceiling(Node node, Key key){
		if(node == null){
			return null;
		}
		int cmp = key.compareTo(node.getKey());
		if(cmp == 0){
			return node;
		}
		if(cmp < 0){
			Node t = this.ceiling(node.getLeft(), key);
			if( t != null){
				return t;
			}else{
				return node;
			}
		}
		return this.ceiling(node.getRight(), key);
	}
	
	/* (non-Javadoc)
	 * @see com.vara.algorithm.tutorial.ISystemTable#max()
	 */
	@Override
	public Key max() {
		return this.max(this.root).getKey();
	}
	
	private Node max(Node node){
		if(node.getRight() == null){
			return node;
		}else{
			return max(node.getRight());
		}
	}

}
