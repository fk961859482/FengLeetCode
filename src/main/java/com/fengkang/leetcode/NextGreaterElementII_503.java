package 单调栈;

import java.util.Stack;

public class NextGreaterElementII_503 {

    public int[] nextGreaterElements(int[] nums) {
        // 结果数组
        int[] ans = new int[nums.length * 2];
        int[] nums_double = new int[nums.length * 2];
        // 拷贝数组，两份拼接
        for (int i = 0; i < nums.length; i++) {
            nums_double[i] = nums[i];
            nums_double[i + nums.length] = nums[i];
        }
        // 维持单调栈，栈顶元素最小
        Stack<Integer> stack = new Stack<>();
        // 测试数组：[1,2,1,1,2,1]
        for (int i = nums_double.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums_double[i] >= stack.peek()) {
                stack.pop();
            }
            // 栈为空，则表示没有比当前元素大的元素
            if(stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(nums_double[i]);
        }

        int[] answer = new int[nums.length];
        for(int i = 0; i< nums.length; i++) {
            answer[i] = ans[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        NextGreaterElementII_503 o = new NextGreaterElementII_503();
        o.nextGreaterElements(new int[]{1,2,1});
    }

}
