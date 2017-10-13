package org.galsang.java.designpattern.create.abstractfactory;

/**
 * Description： 短信发送
 * <br /> Author： galsang
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
