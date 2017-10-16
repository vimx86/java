package org.galsang.java.designpattern.create.singleton;

/**
 * Description： 懒汉式单例模式
 * <br /> Author： galsang
 */
public class SingletonRequiredInitTest {

    private static SingletonRequiredInitTest instance = null;

    private SingletonRequiredInitTest() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonRequiredInitTest();
        }
    }

    public static SingletonRequiredInitTest getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}
