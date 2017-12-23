package org.galsang.java.base.books.effective.article9;

import lombok.extern.java.Log;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Description：
 * <br />Author： vimx86
 */
@Log
class PhoneNumberTest {

    @Test
    void testWithHashMap() {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "Jenny");

        // PhoneNumber 类 不覆盖实现和覆盖实现 hashCode 方法的
        // 不覆盖实现 hashCode 方法，result 结果 为 null
        // 覆盖实现 hashCode 方法，result 结果 为 Jenny
        log.info("result == " + m.get(new PhoneNumber(707, 867, 5309)));

        // 不覆盖实现 hashCode 方法，hashCode 结果 为 不同的
        // 覆盖实现 hashCode 方法，hashCode 结果 为 多次执行应用程序，可以是不相同的，但同一次应用程序的执行期间，必定是相同的
        for (int i = 0; i < 1000; i++) {
            log.info("hashCode == " + new PhoneNumber(707, 867, 5309).hashCode());
        }

    }

}