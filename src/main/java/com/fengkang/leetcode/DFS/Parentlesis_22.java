package com.fengkang.leetcode.DFS;

import java.util.ArrayList;
import java.util.List;

public class Parentlesis_22 {
	
	public static List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<>();
		dfs(n,n, "", ans);
		return ans;
	}
	
	static void dfs(int left, int right, String st, List<String> ans) {
		if(left == 0 && right == 0) {
			ans.add(st);
			return;
		}
		
		if(left > 0) {
			dfs(left - 1, right, st + "(", ans);
		}
		
		if(left < right && right > 0) {
			dfs(left, right - 1, st + ")", ans);
		}
	}
	
	public static void main(String[] args) {
		generateParenthesis(3);
		
	}
}
