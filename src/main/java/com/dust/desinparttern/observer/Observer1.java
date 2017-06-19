package com.dust.desinparttern.observer;

/**
 * FileName: Observer1<p>
 * Description:   <p>
 * Version: v1.0.0<p>
 * Author: liutf<p>
 * Date: 2017-06-16
 */
public class Observer1 implements RadioObserver {

  private Radio radio;

  public Observer1(Radio radio){
    this.radio = radio;
    radio.registerObserver(this);
  }

  @Override
  public void listen(String msg) {
    System.out.println("用户1 已经收听到消息: " + msg);
  }
}
