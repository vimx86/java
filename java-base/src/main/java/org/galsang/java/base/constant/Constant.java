package org.galsang.java.base.constant;

import lombok.extern.java.Log;

/**
 * Description： 常量的调用方式
 * <br /> Author： galsang
 */
@Log
public class Constant {

    public static final String TYPE = "Can I ABC...";

    public static void main(String[] args) {

        String type = null;

        // 推荐使用方式
        log.info(" TYPE.equals(type) === " + TYPE.equals(type));

        // 当前变量 type 为空时 抛出异常， 否则还要进行非空验证，，，
        log.info(" type.equals(TYPE) === " + type.equals(TYPE));

    }

}
