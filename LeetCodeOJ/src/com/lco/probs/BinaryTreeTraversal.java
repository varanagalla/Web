/**
 * 
 */
package com.lco.probs;

import java.util.ArrayList;
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

}
