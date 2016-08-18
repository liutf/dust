package com.dust.guava.base;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.List;
import java.util.UUID;

/**
 * Created by liutf on 2016/8/18.
 */
public class StringOperateTest {

    String separator = "|";

    @Test
    public void JoinerTest(){
        String[] strs = new String[]{"aaa","bbb","cc","",null,null,"dd"};


        Joiner joiner = Joiner.on(separator).skipNulls();     //returns "aaa|bbb|cc||dd"
//        Joiner joiner = Joiner.on(separator).useForNull("NuLl");    //returns "aaa|bbb|cc||NuLl|NuLl|dd"

        String result = joiner.join(strs); //StringBuilder
        System.out.println(result);
    }

    @Test
    public void SplitterTest(){
        String str = "aaa|bbb|cc||dd";
        String[] strs = str.split("\\|"); //aaa,bbb,cc, ,dd

        List<String> list = Splitter.on(separator)
                .trimResults()  //移除字符串的前导入\空包和尾部空白
                .omitEmptyStrings() //从结果中自动忽略空字符串
                .splitToList(str);

        list.forEach(System.out::println);

    }


    @Test
    public void CharMatcherTest(){
        String uuidStr = UUID.randomUUID().toString();
        String removeFrom = CharMatcher.JAVA_ISO_CONTROL.removeFrom("xxx"); //移除control字符
        String retainFrom = CharMatcher.DIGIT.retainFrom("asdsad11de2234550");  //只保留数字字符

    }



}
