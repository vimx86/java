package org.galsang.java.designpattern.create.factorymethod;

/**
 * Description： 测试工厂类
 * <br /> Author： galsang
 */
public class FactoryTestMain {

    public static void main(String[] args) {

        // 1.使用普通工厂方法
        new SendFactory().produce("sms").send();

        // 2.多个工厂方法模式
        new SendFactory().produceMail().send();

        // 3.静态工厂方法模式
        SendFactory.produceStaticMail().send();

    }

}
