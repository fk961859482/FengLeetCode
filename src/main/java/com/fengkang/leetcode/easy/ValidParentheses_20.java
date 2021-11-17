package com.fengkang.leetcode.easy;

import java.util.Stack;

public class ValidParentheses_20 {
	
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i< s.length();i++) {
			
			if(s.charAt(i) == '(' || s.charAt(i)=='[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			}
			
			if(s.charAt(i) == ')') {
				if(stack.isEmpty() ||stack.peek() != '(') {
					return false;
				}
				stack.pop();
			}
			if(s.charAt(i) == ']') {
				if(stack.isEmpty() || stack.peek() != '[') {
					return false;
				}
				stack.pop();
			}
			if(s.charAt(i) == '}') {
				if(stack.isEmpty() ||stack.peek() != '{') {
					return false;
				}
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		ValidParentheses_20 o = new ValidParentheses_20();
		o.isValid("]");
		
	}
}
