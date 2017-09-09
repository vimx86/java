package org.galsang.java.base.method;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Description：
 * <br /> Author： galsang
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {

    /**
     * 雇员姓名
     */
    private String name;

    /**
     * 初始化块
     */
    {
        name = "老板的小秘";
    }


}
