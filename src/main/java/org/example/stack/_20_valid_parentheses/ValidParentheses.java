package org.example.stack._20_valid_parentheses;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (Character ch : s.toCharArray()) {
            switch (ch) {
                case '(', '{', '[' -> stack.push(ch);
                case ')', '}', ']' -> {
                    if (stack.isEmpty() || !matches(stack.pop(), ch)) {
                        return false;
                    }
                }
                default -> {}
            }
        }
        return stack.isEmpty();
    }

    private boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }

}
