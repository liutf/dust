package com.dust.guava.base;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by liutf on 2016/8/18.
 */
public class PreconditionsTest {

    @Test
    public void checkArgumentTest(){
        String str = null;
        Preconditions.checkArgument(StringUtils.isNotBlank(str),"str is blank.",str);    //string is blank. [null]

        int num = -11;
        Preconditions.checkArgument(num > 0,"num is illegal.",num);   //param is illegal. [-11]
    }

    @Test
    public void checkNotNullTest(){
        String a = "aa";
        String b = null;

        Preconditions.checkNotNull(a,"a is null",a);
        Preconditions.checkNotNull(b,"b is null",b);
    }

    @Test
    public void checkStateTest(){
        int state = 0;
        Preconditions.checkState(state == 1,"state not effective",state);
    }

    @Test
    public void checkElementIndexTest(){

        Preconditions.checkElementIndex(1,"aaa".length());

        Preconditions.checkElementIndex(5, Lists.newArrayList("aaa", 111).size());

    }

    @Test
    public void checkPositionIndexTest(){

        Preconditions.checkPositionIndex(1,"aaa".length());

        Preconditions.checkPositionIndex(11,"aaa".length());

    }

    @Test
    public void checkPositionIndexes(){

        Preconditions.checkPositionIndexes(2,5,Lists.newArrayList("a","b",123,5,68,977,9).size());

        Preconditions.checkPositionIndexes(2,5,Lists.newArrayList("a",9).size());

    }



}
