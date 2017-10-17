package org.galsang.java.designpattern.create.prototype;

/**
 * Description： 定义原型类
 * <br /> Author： galsang
 */
public abstract class Prototype {

    @Override
    public abstract Object clone() throws CloneNotSupportedException;

}
