package com.boris.leet;

import java.util.Stack;

public class Solution20 {
    /**
     * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     * 对出栈入栈的考察
     */
    public boolean isValid(String s) {
        Stack<Character> validateStack = new Stack();
        if (s.length() == 0) {
            return true;
        }
        for (char c : s.toCharArray()) {
            if (c == ')' || c == ']' || c == '}') {
                if (validateStack.isEmpty() || !isMatch(validateStack.peek(), c)) {
                    return false;
                } else {
                    validateStack.pop();
                }
            } else {
                validateStack.push(c);
            }
        }

        return validateStack.isEmpty();
    }

    // 判断字符是否匹配
    public boolean isMatch(char left, char right) {
        switch (right) {
            case ')':
                return left == '(';
            case ']':
                return left == '[';
            case '}':
                return left == '{';
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(new Solution20().isValid(str));
    }
}
