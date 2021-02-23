package com.zs.main;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: 自动拆箱和装箱测试
 * @date 2021-02-20
 */
public class BoxingTest {
    public static void main(String[] args) {
        System.out.println(new Integer(5) == 5);
        System.out.println(new Integer(5).intValue() == 5);
        System.out.println(new Integer(5).equals(new Integer(5)));
        System.out.println(new Integer(5) == new Integer(5));

        System.out.println(Integer.valueOf(5) == Integer.valueOf(5));
        System.out.println(Integer.valueOf(200) == Integer.valueOf(200));
    }
}
