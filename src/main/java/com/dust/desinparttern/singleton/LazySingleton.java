package com.dust.desinparttern.singleton;

/**
 * FileName: LazySingleton<p>
 * Description:   <p>
 * Version: v1.0.0<p>
 * Author: liutf<p>
 * Date: 2017-06-19
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    public static LazySingleton getInstance() {
        if(instance == null){
            synchronized (LazySingleton.class){
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance() == new LazySingleton());
    }

}
