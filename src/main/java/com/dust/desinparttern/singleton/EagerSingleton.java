package com.dust.desinparttern.singleton;

/**
 * FileName: EagerSingleton<p>
 * Description:   <p>
 * Version: v1.0.0<p>
 * Author: liutf<p>
 * Date: 2017-06-19
 */
public class EagerSingleton {

    private static EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerSingleton instance = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println(instance == new EagerSingleton());
    }

}
