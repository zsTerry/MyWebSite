package com.zs.main;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: 回文
 * @date 2021-02-02
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originalX = x;
        int tmp = 0;
        int result = 0;
        while(x != 0) {
            tmp = x % 10;
            result = result * 10 + tmp;
            x = x/10;
        }

        return result == originalX;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(-101));
    }
}
