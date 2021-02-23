package com.zs.main;

import java.util.Stack;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: LeetCode125.验证回文字符串
 * @date 2021-02-15
 */
public class LeetCode125 {
    public boolean isPalindrome(String s) {
        if (s == null || "".equals(s)) {
            return true;
        }

        StringBuilder originalStrBD = new StringBuilder();
        Stack<String> strStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= '0' && s.charAt(i) <= '9') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                strStack.push(String.valueOf(s.charAt(i)).toLowerCase());
                originalStrBD.append(String.valueOf(s.charAt(i)).toLowerCase());
            } else {
                continue;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!strStack.empty()) {
            stringBuilder.append(strStack.pop());
        }

        if (originalStrBD.toString().equals(stringBuilder.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //String str = "A man, a plan, a canal: Panama";
        String str = "7rac car7";
        LeetCode125 leetCode125 = new LeetCode125();
        System.out.println(leetCode125.isPalindrome(str));
    }
}
