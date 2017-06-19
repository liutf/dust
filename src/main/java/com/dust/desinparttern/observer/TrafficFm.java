package com.dust.desinparttern.observer;

import java.util.Observable;

/**
 * FileName: TrafficFm<p>
 * Description:   <p>
 * Version: v1.0.0<p>
 * Author: liutf<p>
 * Date: 2017-06-16
 */
public class TrafficFm extends Observable {

    private String msg;

    public String getMsg(){
        System.out.println("TrafficFm - getMsg:" + msg);
        return msg;
    }

    public void push(String msg){
        this.msg = msg;

        super.setChanged();

        super.notifyObservers();
    }

}
