package priv.nightree.datastructure.stackandqueue.n20;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (chr == '{' || chr == '[' || chr == '(') {
                stack.push(chr);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            char pop = stack.pop();
            boolean a = pop == '{' && chr == '}';
            boolean b = pop == '[' && chr == ']';
            boolean c = pop == '(' && chr == ')';
            if (a || b || c) {
                continue;
            }
            return false;
        }
        return stack.isEmpty();
    }
}

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("{([)}"));
    }
}
