package com.dust.guava.collect;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import org.junit.Test;

/**
 * Created by liutf on 2016/8/19.
 */
public class NewCollectionsTest {

    public static final ImmutableSet<String> COLOR_NAMES = ImmutableSet.of(
            "red",
            "orange",
            "black",
            "blue"
    );

    @Test
    public void ImmutableSetTest(){
        COLOR_NAMES.forEach(System.out::println);
    }

    @Test
    public void MultimapTest(){
        HashMultimap<String, Object> multimap = HashMultimap.create();
        multimap.put("key - a","111111");
        multimap.put("key - b", Lists.newArrayList("aa","bb","ccc"));

        multimap.entries().forEach(System.out::println);
    }

    
    

}
