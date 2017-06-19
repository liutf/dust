package com.dust.desinparttern.observer;

import java.util.Observable;

/**
 * FileName: MusicFM<p>
 * Description:   <p>
 * Version: v1.0.0<p>
 * Author: liutf<p>
 * Date: 2017-06-16
 */
public class MusicFm extends Observable {

    private String msg ;


    public String getMsg(){
        System.out.println("MusicFm - getMsg:" + msg);
        return msg;
    }


    /**
     *  推送内容
     *
     * @param msg
     */
    public void push(String msg)
    {
        this.msg = msg  ;
        setChanged();
        notifyObservers();
    }

}
