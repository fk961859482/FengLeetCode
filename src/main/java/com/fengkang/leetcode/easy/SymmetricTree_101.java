package com.fengkang.leetcode.easy;

import javax.swing.tree.TreeNode;

public class SymmetricTree_101 {
	
	public boolean isSymmetric(TreeNode root) {
		return sameTree(root, root);
	}
	
	public boolean sameTree(TreeNode t1, TreeNode t2) {
		
		if(t1 == null && t2 == null) {
			return true;
		}
		
		if(t1 == null && t2 != null) {
			return false;
		}
		
		if(t2 == null && t1 != null) {
			return false;
		}
		return t1.val == t2.val && sameTree(t1.left, t2.right) && sameTree(t1.right, t2.left);
	}
	
}
