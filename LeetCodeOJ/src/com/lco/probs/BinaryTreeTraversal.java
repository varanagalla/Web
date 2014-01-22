/**
 * 
 */
package com.lco.probs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author vpsrini
 *
 */


//Definition for binary tree
class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


   

public class BinaryTreeTraversal {
	
	public ArrayList<Integer> preorderTraversal(TreeNode root) {
	       ArrayList<Integer> orderList = new ArrayList<Integer>();
	       Stack<TreeNode> traversalStack = null;
	       if(root == null){
	    	   return orderList;
	       }
	       traversalStack = new Stack<TreeNode>();
	       
	       traversalStack.push(root);
	       TreeNode current = null;
	       while(!traversalStack.isEmpty()){
	    	   	current = traversalStack.pop();
	    	   	orderList.add(current.val);
	    	   	if(current.right != null){
	    	   		traversalStack.push(current.right);
	    	   	}
	    	   	if(current.left != null){
	    	   		traversalStack.push(current.left);
	    	   	}
	       }
	       return orderList;
	   }
	
	public ArrayList<Integer> inorderTraversal(TreeNode root){
		ArrayList<Integer> inOrderNodes = new ArrayList<Integer>();
		if(root == null){
			return inOrderNodes;
		}
		Stack<TreeNode> traversalStack = new Stack<TreeNode>();
		TreeNode current = root;
		while(!traversalStack.isEmpty() || current != null){
			if(current == null){
				current = traversalStack.pop();
				inOrderNodes.add(current.val);
				current = current.right;
			}
			else{
				traversalStack.push(current);
				current = current.left;
			}
		}
		return inOrderNodes;
	}
	
	public ArrayList<Integer> postorderTraversal(TreeNode root) {
        
		ArrayList<Integer> orderList = new ArrayList<Integer>();
	       Stack<TreeNode> traversalStack = null;
	       if(root == null){
	    	   return orderList;
	       }
	       traversalStack = new Stack<TreeNode>();
	       traversalStack.push(root);
	       TreeNode current = null;
	       TreeNode previous = null;
	       while(!traversalStack.isEmpty()){
	    	   current = traversalStack.peek();
	    	   if(previous == null || previous.left == current || previous.right == current){
	    		   if(current.left != null){
	    			   traversalStack.push(current.left);
	    		   }else if(current.right != null){
	    			   traversalStack.push(current.right);
	    		   }
	    	   }else if(current.left == previous){
	    		   if(current.right != null){
	    			   traversalStack.push(current.right);
	    		   }
	    	   }else{
	    		   orderList.add(traversalStack.pop().val);
	    	   }
	    	   previous = current;
	       }
	       return orderList;
		
    }
	
	public ArrayList<Integer> levelOrderTraversal(TreeNode root){
		ArrayList<Integer> orderList = new ArrayList<Integer>();
		if(root == null){
			return orderList;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode current = null;
		while(!queue.isEmpty()){
			current = queue.remove();
			orderList.add(current.val);
			if(current.left != null){
				queue.add(current.left);
			}
			if(current.right != null){
				queue.add(current.right);
			}
		}
		return orderList;
	}

}
