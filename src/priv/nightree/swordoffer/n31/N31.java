package priv.nightree.swordoffer.n31;

import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (popped.length == 0) {
            return true;
        }
        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;
        while (true) {
            while (i < pushed.length && pushed[i] != popped[j]) {
                stack.push(pushed[i]);
                i++;
            }
            j++;
            while (!stack.isEmpty() && j < popped.length && popped[j] == stack.peek()) {
                stack.pop();
                j++;
            }
            if (j == popped.length) {
                break;
            }
            i++;
        }
        return stack.isEmpty();
    }
}

public class N31 {
    public static void main(String[] args) {
        int[] pushed = {1,0};
        int[] popped = {1,9};
        System.out.println(new Solution().validateStackSequences(pushed, popped));
    }
}
