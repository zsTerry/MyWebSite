package com.zs.main;

import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: LeetCode58.最后一个字符串长度
 * @date 2021-02-13
 */
public class LeetCode58 {
    public int lengthOfLastWord(String s) {
        if (StringUtils.isEmpty(s) || " ".equals(s)) {
            return 0;
        }

        List<String> strList = Arrays.asList(s.split(" "));
        if(strList == null || strList.size() == 0) {
            return 0;
        }

        String lastWord = strList.get(strList.size() - 1);
        int length = lastWord.length();
        return length;
    }
}
