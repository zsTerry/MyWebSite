package com.zs.main;

/**
 * @author zshuai
 * @Title: some-test
 * @Description: 单例模式
 * @date 2021-02-20
 */
public class Singleton {
    private Singleton(){}

    private static Singleton singleton = null;

    //线程不安全
    /*public static Singleton getInstance() {
        if (singleton == null) {
            return new Singleton();
        }
        return singleton;
    }*/

    //线程安全
    /*public static synchronized Singleton getInstance() {
        if (singleton == null) {
            return new Singleton();
        }
        return singleton;
    }*/

    //双重校验
    /*public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    return new Singleton();
                }
            }
        }
        return singleton;
    }*/

    //静态内部类
    /*private static class SingletonInstance {
        private static final Singleton singleton2 = new Singleton();
    }

    public static synchronized Singleton getInstance() {
        return SingletonInstance.singleton2;
    }*/
}
