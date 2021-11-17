package 单调栈;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI_496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 结果数组
        int[] ans = new int[nums1.length];
        // 存储num2中每个元素的nextGreater元素
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // 单调递增栈，即栈顶元素最小
        Stack<Integer> stack = new Stack<>();
        // 测试数组：[1,3,4,2]
        for (int i = nums2.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums2[i] > stack.peek()) {
                stack.pop();
            }
            // 栈为空，则表示没有比当前元素大的元素
            if(stack.isEmpty()) {
                hashMap.put(nums2[i], -1);
            } else {
                hashMap.put(nums2[i], stack.peek());
            }
            stack.push(nums2[i]);
        }

        for(int i = 0; i< nums1.length; i++) {
            ans[i] = hashMap.get(nums1[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
         com.fengkang.leetcode.monostack.NextGreaterElementI_496 o = new com.fengkang.leetcode.monostack.NextGreaterElementI_496();
         o.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4});
    }

}
