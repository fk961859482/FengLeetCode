package com.fengkang.leetcode.monostack;

import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length];
        // 单调栈，栈顶元素最小；保存索引值
        Stack<Integer> stack = new Stack<>();
        for(int i = temperatures.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                answer[i] = 0;
            } else {
                answer[i] = stack.peek() - i ;
            }
            stack.push(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        DailyTemperatures o = new DailyTemperatures();
        o.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
    }
}
