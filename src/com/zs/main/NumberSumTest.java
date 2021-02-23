package com.zs.main;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: 求和
 * @date 2019/12/25 18:11
 */
public class NumberSumTest {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 2};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result);
    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        List<Integer> indexs = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if (!CollectionUtils.isEmpty(indexs) && indexs.contains(i)) {
                continue;
            }

            for (int j = i+1; j < nums.length;j++){
                if (!CollectionUtils.isEmpty(indexs) && indexs.contains(j)) {
                    continue;
                }
                if (nums[i] + nums[j] == target) {
                    indexs.add(i);
                    indexs.add(j);
                }
            }
        }

        return indexs.stream().mapToInt(Integer::valueOf).toArray();
    }
}
