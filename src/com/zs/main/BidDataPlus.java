package com.zs.main;

import org.springframework.util.StringUtils;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: 两个大数求和
 * @date 2021-02-08
 */
public class BidDataPlus {
    public static String add(String str1, String str2) {
        if ((str1 == null || "".equals(str1)) && (str2 == null || "".equals(str2))) {
            return "";
        }

        //如果只有一个串不空直接返回那个串
        if (StringUtils.isEmpty(str1)) {
            return str2;
        }
        if (StringUtils.isEmpty(str2)) {
            return str1;
        }

        int length1 = str1.length();
        int length2 = str2.length();
        //返回结果长度是两个大数中大的那一个，且考虑到可能有进位，要比大的那个大数多一位
        int maxLength = Math.max(length1, length2);
        StringBuffer result = new StringBuffer(maxLength + 1);

        //翻转字符串，方便计算当前位和进位
        str1 = new StringBuffer(str1).reverse().toString();
        str2 = new StringBuffer(str2).reverse().toString();

        //找出两个数中小的那个数的长度，用作计算两个数公共长度的部分
        int minLength = Math.min(length1, length2);

        int carry = 0;
        int currentNum = 0;
        int i = 0;
        for (; i < minLength; i++) {
            currentNum = str1.charAt(i) + str2.charAt(i) - 2*'0' + carry;
            carry = currentNum/10;
            result.append(currentNum%10);
        }

        //把长的字符串剩余部分继续计算
        if (length1 < length2) {
            str1 = str2;
        }
        for (;i < str1.length(); i++) {
            currentNum = str1.charAt(i) - '0' + carry;
            carry = currentNum/10;
            result.append(currentNum%10);
        }

        //最后有个进位检查
        if (carry > 0) {
            result.append(carry);
        }

        //切记最后把字符串翻转
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String str1 = "9999999999999999";
        String str2 = "9999999999999999";
        System.out.println(add(str1, str2));
    }
}
