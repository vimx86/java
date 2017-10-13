package org.galsang.java.designpattern.create.abstractfactory;


/**
 * Description： 测试工厂类
 * <br /> Author： galsang
 */
public class FactoryTestMain {

    public static void main(String[] args) {

        new SendMailFactory().produce().send();

        new SendSmsFactory().produce().send();

    }

}
