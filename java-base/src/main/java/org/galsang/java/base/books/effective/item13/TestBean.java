package org.galsang.java.base.books.effective.item13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Description：
 * <br />Author： vimx86
 */
public class TestBean {

    // 这样使用是有安全漏洞的。
//    public static final String[] PRIVATE_VALUES = {};

    // 方法一： 使公有数组变成私有的，并增加一个公有的不可变的列表。
    // 本人推荐使用这种方式，因为方法二中设计到 clone 的使用，增加设计难度。
    private static final String[] PRIVATE_VALUES = {};
    public static final List<String> VALUES  =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    // 方法二： 可以使数组变成私有的，并添加一个公有方法，它返回私有数组的一个克隆。
//    private static final String[] PRIVATE_VALUES = {};
//    public static final String[] valus() {
//        return PRIVATE_VALUES.clone();
//    }

}

