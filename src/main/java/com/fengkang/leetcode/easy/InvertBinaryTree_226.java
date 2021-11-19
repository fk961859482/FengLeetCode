//package com.fengkang.leetcode.easy;
//
//import javax.swing.tree.TreeNode;
//
//public class InvertBinaryTree_226 {
//
//	public TreeNode invertTree(TreeNode root) {
//		bfs(root);
//		return root;
//	}
//
//	public void bfs(TreeNode root) {
//		if(root == null) {
//			return ;
//		}
//		TreeNode leftt = root.left;
//		root.left = root.right;
//		root.right = leftt;
//		invertTree(root.left);
//		invertTree(root.right);
//	}
//}
