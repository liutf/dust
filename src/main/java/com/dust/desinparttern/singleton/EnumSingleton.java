package com.dust.desinparttern.singleton;

/**
 * FileName: EnumSingleton<p>
 * Description:   <p>
 * Version: v1.0.0<p>
 * Author: liutf<p>
 * Date: 2017-06-19
 */
public enum EnumSingleton {

    INSTANCE;

    EnumSingleton() {
        System.out.println("EnumSingleton 构造方法.");
    }

    public void say(){
        System.out.println("say what.");
    }


    public static void main(String[] args) {
        EnumSingleton.INSTANCE.say();
        EnumSingleton.INSTANCE.say();
        EnumSingleton.INSTANCE.say();
    }

}
