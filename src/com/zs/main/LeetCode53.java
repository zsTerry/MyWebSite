package com.zs.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: LeetCode53.最大子序和
 * @date 2021-02-16
 */
public class LeetCode53 {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int maxResult = nums[0];
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current = Math.max(nums[i], current + nums[i]);
            maxResult = Math.max(current, maxResult);
        }

        return maxResult;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        LeetCode53 leetCode53 = new LeetCode53();
        System.out.println(leetCode53.maxSubArray(nums));
    }
}
