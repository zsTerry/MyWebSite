package com.zs.main;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: LeetCode3.查找字符串中没有重复元素的最长子串
 * @date 2021-02-16
 */
public class LeetCode3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        Map<Character, Integer> resultMap = new HashMap<>();
        for (int i = 0, start = 0; i < s.length(); i++) {
            if (resultMap.containsKey(s.charAt(i))) {
                start = Math.max(resultMap.get(s.charAt(i)), start);
            }
            resultMap.put(s.charAt(i), i + 1);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}
