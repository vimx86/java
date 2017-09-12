package org.galsang.java.features.jdk8.lambda;

import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Description：
 * <br /> Author： galsang
 */
@Log
public class ParamLambda {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList() {
            {
                add("Hello");
                add("你好");
            }
        };

        Iterator iterator = arrayList.iterator();

        iterator.forEachRemaining(o -> log.info(o.toString()));

        arrayList.forEach(log::info);


    }

}

