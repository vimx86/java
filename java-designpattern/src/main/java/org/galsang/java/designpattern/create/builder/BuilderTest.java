package org.galsang.java.designpattern.create.builder;

/**
 * Description： 创建者模式测试
 * <br /> Author： galsang
 */
public class BuilderTest {

    public static void main(String[] args) {

        Builder builder = new Builder();
        builder.produceMail(10);
        builder.produceSms(3);

        builder.getSenderList().forEach(o -> o.send());
    }

}
