package com.dust.guava.collect;

import com.google.common.collect.ImmutableSet;
import org.junit.Test;

/**
 * Created by liutf on 2016/8/19.
 */
public class ImmutableSetTest {

    public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "black",
            "blue"
    );

    @Test
    public void test(){
        COLOR_NAMES.forEach(System.out::println);
    }

}
