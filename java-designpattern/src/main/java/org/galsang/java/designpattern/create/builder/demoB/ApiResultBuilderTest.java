package org.galsang.java.designpattern.create.builder.demoB;

import org.galsang.java.designpattern.create.builder.demoB.ApiResult.ApiResultBuilder;

/**
 * Description：
 * <br /> Author： galsang
 */
public class ApiResultBuilderTest {

    public static void main(String[] args) {
        String beanInfo = new ApiResultBuilder().withName("测试").withAge(18).builder().toString();
        System.out.println("beanInfo: === " + beanInfo);
    }
}
