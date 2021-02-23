package com.zs.main;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: LeetCode28.求子串在原串第一次出现的位置
 * @date 2021-02-13
 */
public class LeetCode28 {
    public int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)) {
            return 0;
        }
        if (haystack == null || "".equals(haystack)) {
            return -1;
        }

        int needleLength = needle.length();
        int haystackLength = haystack.length();
        for (int i = 0; i < haystackLength - needleLength + 1; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
