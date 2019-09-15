package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversalIterative {

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = null;
		TreeNode t3 = new TreeNode(2);
		TreeNode t4 = new TreeNode(3);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t4.left = null;
		t4.right = null;
		List<Integer> list = inorderTraversal(t1);
		for(int val:list){
			System.out.println(val);
		}
		System.out.println();

	}
	
	/**
	 * Definition for a binary tree node.
	 * 
	 */
	 public static class TreeNode {
	     int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	 
	 public static List<Integer> inorderTraversal(TreeNode root) {
		    List<Integer> inorderList = new ArrayList<Integer>();
		    	Stack<TreeNode> stack = new Stack<TreeNode>();
		    	TreeNode current = root;
		    	while(current!=null || !stack.isEmpty()){
		    		while(current!=null){
		    			stack.push(current);
		    			current = current.left;
		    		}
	                current = stack.pop();
		    		inorderList.add(current.val);
		    		current = current.right;
		    	}
				return inorderList ;
		    }


}
