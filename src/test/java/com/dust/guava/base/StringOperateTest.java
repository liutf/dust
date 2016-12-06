package com.dust.guava.base;

import com.google.common.base.*;
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
        byte[] bytes = uuidStr.getBytes(Charsets.UTF_8);

        String noContro = CharMatcher.JAVA_ISO_CONTROL.removeFrom(uuidStr); //移除字符串中的control字符
        String spaced = CharMatcher.WHITESPACE.trimAndCollapseFrom(uuidStr, ' '); //去除两端空格,并把中间的连续空格替换成单个空格
        String onlyDigit = CharMatcher.DIGIT.retainFrom(uuidStr);  //字符串中只保留数字字符
        String digitAndLower = CharMatcher.JAVA_DIGIT.or(CharMatcher.JAVA_LOWER_CASE).retainFrom(uuidStr);  //只保留数字以及小写字母
        String noDigit = CharMatcher.JAVA_DIGIT.replaceFrom(uuidStr, "*");  //用*替代所有数字


        System.out.println(noContro);
        System.out.println(spaced);
        System.out.println(onlyDigit);
        System.out.println(digitAndLower);
        System.out.println(noDigit);
    }


    @Test
    public void CaseFormatTest(){
        String name = "user_name";
        String toLowerCamel = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name);//下划线小写词组转换为小写驼峰
        String toUpperCamel = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, name);//下划线小写词组转换为小写驼峰
        System.out.println(toLowerCamel);
        System.out.println(toUpperCamel);
    }


}
