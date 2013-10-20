/**
 * 
 */
package com.cci.core.test;

import java.util.Iterator;

import com.cci.core.LinkedBinaryTree;

/**
 * @author vpsrini
 *
 */
public class LinkedBinaryTreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String e11 = "J";
		String e8  = "G";
		String e9  = "C";
		String e10 = "H";
		String e4  = "I";
		String e5  = "A";
		String e6  = "F";
		String e7  = "K";
		String e2  = "E";
		String e3  = "B";
		String e1  = "D";
		
		LinkedBinaryTree<String> n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11;
		
		n11 = new LinkedBinaryTree<String>(e11);
		n8  = new LinkedBinaryTree<String>(e8);
		n9 = new LinkedBinaryTree<String>(e9,null,n11);
		n10 = new LinkedBinaryTree<String>(e10);
		n4 = new LinkedBinaryTree<String>(e4);
		n5 = new LinkedBinaryTree<String>(e5,n8,n9);
		n6 = new LinkedBinaryTree<String>(e6);
		n7 = new LinkedBinaryTree<String>(e7,n10,null);
		n2 = new LinkedBinaryTree<String>(e2,n4,n5);
		n3 = new LinkedBinaryTree<String>(e3,n6,n7);
		n1 = new LinkedBinaryTree<String>(e1,n2,n3);
		
		Iterator<String> preIter = n1.preOrder();
		System.out.println("Preorder Display (See beow) :: ");
		while(preIter.hasNext()){
			System.out.print(preIter.next() + "\t");
		}
		System.out.println();
		Iterator<String> inIter = n1.inOrder();
		System.out.println("Inorder Display (See below) :: ");
		while(inIter.hasNext()){
			System.out.print(inIter.next() + "\t");
		}
		System.out.println();
		Iterator<String> postIter = n1.postOrder();
		System.out.println("PostOrder Display (See below) :: ");
		while(postIter.hasNext()){
			System.out.print(postIter.next() + "\t");
		}
		System.out.println();
		Iterator<String> levelIter = n1.levelOrder();
		System.out.println("LevelOrder Display (See below) :: ");
		while(levelIter.hasNext()){
			System.out.print(levelIter.next() + "\t");
		}
	}

}
