package com.fengkang.leetcode.DFS;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber_17 {
	private List<String> res = new ArrayList<>();
	
	
	public List<String> letterCombinations(String digits) {
		List<String> numberList = new ArrayList<>();
		numberList.add("abc");
		numberList.add("def");
		numberList.add("ghi");
		numberList.add("jkl");
		numberList.add("mno");
		numberList.add("pqrs");
		numberList.add("tuv");
		numberList.add("wxyz");
		help(new StringBuilder(), 0, digits, numberList);
		return res;
	}
	
	void help(StringBuilder ans, int j, String digits, List<String> numberList) {
		if (j == digits.length()) {
			res.add(ans.toString());
			return;
		}
		String curStr = numberList.get(digits.charAt(j) - '0' - 2);
		for (int i = 0; i < curStr.length(); i++) {
			ans.append(curStr.charAt(i));
			help(ans, j + 1, digits, numberList);
			ans.deleteCharAt(j);
		}
		
		
	}
	
	public static void main(String[] args) {
		LetterCombinationsOfPhoneNumber_17 l = new LetterCombinationsOfPhoneNumber_17();
		l.letterCombinations("23");
		System.out.println(l.res);
		
	}
}



