package com.dust.guava.base;

import com.google.common.base.Optional;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by liutf on 2016/8/18.
 */
public class OptionalTest {

    @Test
    public void test(){
        String str = "hello guava";
//        Optional<String> optional = Optional.of(str); //创建Optional实例,若引用为null,则快速失败.
//        Optional<String> optional = Optional.of(null);

//        Optional<String> optional = Optional.absent();  //创建引用缺失的Optional实例

//        Optional<String> optional = Optional.fromNullable(null);  //若引用为null表示则表示缺失
        Optional<String> optional = Optional.fromNullable(str);

        boolean present = optional.isPresent();
        Assert.assertTrue(present);

        String actual = optional.get();
        Assert.assertEquals(str, actual);

        if(present){
            System.out.println(actual);
        }

    }


}
