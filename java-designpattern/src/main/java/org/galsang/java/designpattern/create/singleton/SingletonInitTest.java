package org.galsang.java.designpattern.create.singleton;

/**
 * Description： 饿汉式单例模式
 * <br /> Author： galsang
 */
public class SingletonInitTest {

    private static SingletonInitTest instance = new SingletonInitTest();

    private SingletonInitTest() {
    }

    public static SingletonInitTest getInstance() {
        return instance;
    }
}
