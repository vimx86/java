package org.galsang.java.base.exception;

import lombok.extern.java.Log;

/**
 * Description： 当 finally 子句包含 return 语句时， 将会出现一种意想不到的结果„ 假设利用 return
 * 语句从 try语句块中退出。在方法返回前， finally 子句的内容将被执行。如果 finally 子句中
 * 也有一个 return 语句， 这个返回值将会覆盖原始的返回值。
 * <br /> Author： galsang
 */
@Log
public class TryFinally {


    public static void main(String[] args) {

        log.info(" 返回了什么 === " + TryFinally.div(1, 1));

    }

    public static int div(int numOne, int numTwo) {
        try {
            return numOne / numTwo;
        } finally {
            return 0;
        }

    }

}
