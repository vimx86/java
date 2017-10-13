package org.galsang.java.designpattern.create.abstractfactory;

/**
 * Description： 邮件发送工厂
 * <br /> Author： galsang
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
