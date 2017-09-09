package org.galsang.java.base.method;


import lombok.extern.java.Log;

/**
 * Description：
 * <br /> Author： galsang
 */
@Log
public class BaseMethodParam {

    public static void main(String[] args) {

        // 对象应用传递
        Employee a = new Employee("张三");
        Employee b = new Employee("李四");
        log.info("a  " + a.toString());
        log.info("b  " + b.toString());
        BaseMethodParam.swap(a, b);
        log.info(" ---------------------------------- ");
        log.info("a  " + a.toString());
        log.info("b  " + b.toString());

        // 初始化块
        Employee employee = new Employee();
        log.info("employee  " + employee.toString());
        log.info(" ---------------------------------- ");

        // 继承 is a
        Employee manager = new Manager();
        log.info("manager  " + manager.toString());
        log.info(" ---------------------------------- ");

        // instanceof
        Employee test = null;
        log.info("test  " + (test instanceof Employee));


    }

    /**
     * 交换 a, b 对象，不能完成交换，，，执行的是对象引用的传递
     *
     * @param x
     * @param y
     */
    public static void swap(Employee x, Employee y) {

        Employee temp = x;
        x = y;
        y = temp;
    }

}
