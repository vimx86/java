package org.galsang.java.designpattern.create.abstractfactory;

/**
 * Description： 短信发送工厂
 * <br /> Author： galsang
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
