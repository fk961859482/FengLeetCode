package com.fengkang.leetcode.DFS;

import java.util.ArrayList;
import java.util.List;

public class SubSets_78 {
	
	List<List<Integer>> ans = new ArrayList<>();
	public List<List<Integer>> subsets(int[] nums) {
		dfs(0, new ArrayList<>(), nums);
		return ans;
	}
	
	void dfs(int index, List<Integer> res, int[] nums) {
		ans.add(new ArrayList<>(res));
		for(int i = index; i < nums.length; i++) {
			res.add(nums[i]);
			dfs(i + 1 , res, nums);
			res.remove(res.size() - 1);
		}
	}
	
	public static void main(String[] args) {
		SubSets_78 subSets_78 = new SubSets_78();
		subSets_78.subsets(new int[]{1,2,3});
		System.out.println("hello");
		
	}
	
	

}
