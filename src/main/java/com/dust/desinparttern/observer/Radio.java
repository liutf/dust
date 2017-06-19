package com.dust.desinparttern.observer;

/**
 * FileName: PublicRadio<p>
 * Description:   <p>
 * Version: v1.0.0<p>
 * Author: liutf<p>
 * Date: 2017-06-16
 */
public interface Radio {

    void registerObserver(RadioObserver observer);

    void delObserver(RadioObserver observer);

    void notifyObservers();


}
