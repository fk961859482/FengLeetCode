package com.fengkang.leetcode.DFS;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum_39 {
	private List<List<Integer>> ans = new ArrayList<>();
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> res = new ArrayList<>();
		dfs(0, candidates, res, target);
		return ans;
	}
	
	void dfs(int index, int[] candidates, List<Integer> res, int target) {
		if (0 == target) {
			ans.add(new ArrayList<>(res));
			return;
		}
		if (target < 0) {
			return;
		}
		for (int i = index; i < candidates.length; i++) {
			res.add(candidates[i]);
			dfs(i, candidates, res, target - candidates[i]);
			res.remove(res.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		CombinationSum_39 combinationSum_39 = new CombinationSum_39();
		combinationSum_39.combinationSum(new int[]{2, 3, 6, 7}, 7);
		System.out.println(combinationSum_39.ans);
	}
}
