package org.example._20_valid_parentheses;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (ch.equals('(') || ch.equals('{') || ch.equals('[')) {
                stack.push(ch);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }

            if (ch.equals(')') && stack.peek().equals('(')) {
                stack.pop();
            } else if (ch.equals('}') && stack.peek().equals('{')) {
                stack.pop();
            } else if (ch.equals(']') && stack.peek().equals('[')) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

}
