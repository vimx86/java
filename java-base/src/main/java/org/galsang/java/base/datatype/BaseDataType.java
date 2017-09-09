package org.galsang.java.base.datatype;

import lombok.extern.java.Log;

/**
 * Description： Java基本数据类型的验证
 * <br /> Author： galsang
 */
@Log
public class BaseDataType {

    public static void main(String[] args) {

        int testA = 0b1001;
        log.info("testA = " + testA);
        //testA = 9

        int testB = 0b1111_0100_0010_0100_0000;
        log.info("testB = " + testB);
        //testB = 1000000

        int testC = 1_000_000;
        log.info("testC = " + testC);
        //testC = 1000000

        float testD = 1.0f;
        log.info("testD = " + testD/0);
        //testD = Infinity

        log.info("" + (2.0 - 1.1));
        //0.8999999999999999

        log.info("" + String.join(" / ","A","B"));
        //A / B


    }

}
