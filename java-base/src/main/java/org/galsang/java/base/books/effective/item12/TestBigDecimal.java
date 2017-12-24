package org.galsang.java.base.books.effective.item12;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * Description：
 * <br />Author： vimx86
 */
public class TestBigDecimal {

    public static void main(String[] args) {

        HashSet<BigDecimal> hashSet = new HashSet<>();
        TreeSet<BigDecimal> treeSet = new TreeSet<>();

        BigDecimal bigDecimalA = new BigDecimal("1.0");
        BigDecimal bigDecimalB = new BigDecimal("1.00");

        Collections.addAll(hashSet, bigDecimalA, bigDecimalB);
        System.out.println("haseSet == " + hashSet); // haseSet == [1.0, 1.00]

        Collections.addAll(treeSet, bigDecimalA, bigDecimalB);
        System.out.println("treeSet == " + treeSet); // treeSet == [1.0]

    }
}
