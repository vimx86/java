package org.galsang.java.base.books.effective.item12;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Description： Comparable 自然排序案例
 * <br />Author： vimx86
 */
public class WordList {

    public static void main(String[] args) {


        // 由于 String 数组实现了 Comparable 接口 为自然排序关系，可以使用 Arrays.sort(arrayStr) 进行排序。
        String[] arrayStr = new String[]{"CD", "AWE", "WER"};
        System.out.println(Arrays.toString(arrayStr)); // [CD, AWE, WER]
        Arrays.sort(arrayStr);
        System.out.println(Arrays.toString(arrayStr)); // [AWE, CD, WER]

        //
        Set<String> s = new TreeSet<>();
        Collections.addAll(s, args);
        System.out.println(s); //[AWE, CD, WER]

    }

}
