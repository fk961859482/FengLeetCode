package com.fengkang.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {
	
	/**
	 * 思路1：快慢指针
	 * 思路2: 前半部分入栈，与后半部分比较
	 * 思路3：bf做法
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(ListNode head) {
		List<Integer> values = new ArrayList<>();
		while (head != null) {
			values.add(head.val);
			head = head.next;
		}
		for(int i = 0 ,j = values.size() - 1 ;i < j;i++, j--) {
			if(!values.get(i).equals(values.get(j))) {
				return false;
			}
		}
		return true;
	}
}
