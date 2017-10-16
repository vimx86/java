package org.galsang.java.designpattern.create.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Description： 创建者模式
 * <br /> Author： galsang
 */
public class Builder {

    private List<Sender> senderList = new ArrayList<>();

    public List<Sender> getSenderList() {
        return senderList;
    }

    public void setSenderList(List<Sender> senderList) {
        this.senderList = senderList;
    }

    public void produceMail(int count) {
        for (int i = 0; i < count; i++) {
            senderList.add(new MailSender());
        }
    }

    public void produceSms(int count) {
        for (int i = 0; i < count; i++) {
            senderList.add(new SmsSender());
        }
    }

}
