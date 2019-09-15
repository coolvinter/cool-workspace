package com.leetcode;

public class SymmetricSubtree {
	
	public static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		System.out.println(isSymmetric(new SymmetricSubtree.TreeNode(0)));

	}
	public static boolean isSymmetric(TreeNode root) {
        if (root ==null) 
            return true;
        return isSymmetricHelper(root.left,root.right);
    }
    public static boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left==null && right==null){
            return true;
        }
        if(left==null || right ==null){
            return false;
        }
        if(left.val==right.val){
            return (isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left));
        }else{
            return false;
        }
    }
}
