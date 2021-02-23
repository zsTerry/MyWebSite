package com.zs.main;

import java.util.HashSet;
import java.util.Map;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: 删除数组中重复元素
 * @date 2021-02-02
 */
public class DuplicateArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for (int x = 0; x < i + 1; x++) {
            if (x == 0) {
                System.out.print("[" + nums[x] + ",");
            } else if (x == i) {
                System.out.println(nums[x] + "]");
            } else {
                System.out.print(nums[x] + ",");
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        DuplicateArray duplicateArray = new DuplicateArray();
        System.out.println("删除重复元素后数组长度:" + duplicateArray.removeDuplicates(nums));
    }
}
