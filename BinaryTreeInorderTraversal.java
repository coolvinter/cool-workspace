package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

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
	    	helper(root, inorderList);
	        return inorderList;
	    }

		private static void helper(TreeNode root, List<Integer> inorderList) {
			if(root!=null){
		            if(root.left!=null){
		            	helper(root.left, inorderList);
		            }
		            inorderList.add(root.val);
		            if(root.right!=null){
		            	helper(root.right, inorderList);
		            }
		    }
		}

}
