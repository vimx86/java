package org.galsang.java.designpattern.create.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Description： 单例注册表
 * <br /> Author： galsang
 */
public class SingletonRegister {

    private static Map<String, Object> registerMap = new HashMap<>(16);

    static {
        SingletonRegister singletonRegister = new SingletonRegister();
        registerMap.put(singletonRegister.getClass().getName(), singletonRegister);
    }

    //受保护的默认构造函数，如果为继承关系，则可以调用，克服了单例类不能为继承的缺点
    protected SingletonRegister() {
    }

    /**
     * @param name
     * @return
     */
    public static SingletonRegister getInstance(String name) {

        if (name == null) {
            name = "SingletonRegister";
        }

        if (registerMap.get(name) == null) {
            try {
                registerMap.put(name, Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        return (SingletonRegister) registerMap.get(name);
    }

}
