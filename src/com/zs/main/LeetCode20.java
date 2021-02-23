package com.zs.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: LeetCode20.有效的括号
 * @date 2021-02-16
 */
public class LeetCode20 {
    public boolean isValid(String s) {
        if (s == null || "".equals(s)) {
            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();
        charMap.put('{', '}');
        charMap.put('(', ')');
        charMap.put('[', ']');
        //charMap.put('<', '>');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (charMap.containsKey(c)) {
                stack.push(c);
            } else if (charMap.containsValue(c)){
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (charMap.get(stack.peek()) == c) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
