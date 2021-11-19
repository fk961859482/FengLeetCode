//package com.fengkang.leetcode.DFS;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FlattenBinaryTreetoLinkedList_114 {
//
//	public void flatten(TreeNode root) {
//		if(root == null) {
//			return;
//		}
//		TreeNode ans = new TreeNode(root.val);
//		preOrder(ans, root);
//		return ans;
//	}
//
//	void preOrder(TreeNode ans, TreeNode root) {
//		List<Integer> a= new ArrayList<>();
//		a.get()
//		if(root == null) {
//			return;
//		}
//		ans.right = root.val;
//		preOrder(root.left);
//		preOrder(root.right);
//	}
//}
