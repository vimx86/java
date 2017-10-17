package org.galsang.java.designpattern.create.builder.demoA;

/**
 * Description： 邮件发送
 * <br /> Author： galsang
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mail sender!");
    }
}
