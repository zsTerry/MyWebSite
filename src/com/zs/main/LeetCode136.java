package com.zs.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: LeetCode136.找出数组中只出现一次的元素
 * @date 2021-02-15
 */
public class LeetCode136 {
    public int singleNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            if (numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num) + 1);
            } else {
                numMap.put(num, 1);
            }
        }

        Iterator map1it = numMap.entrySet().iterator();
        while(map1it.hasNext())
        {
            Map.Entry<Integer, Integer> entry = (Map.Entry<Integer, Integer>) map1it.next();
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1};
        LeetCode136 leetCode136 = new LeetCode136();
        System.out.println(leetCode136.singleNumber(nums));
    }
}
