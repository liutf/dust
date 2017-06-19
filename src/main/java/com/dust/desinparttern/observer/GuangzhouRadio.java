package com.dust.desinparttern.observer;

import com.google.common.collect.Lists;
import java.util.List;

/**
 * FileName: GuangzhouRadio<p>
 * Description:   <p>
 * Version: v1.0.0<p>
 * Author: liutf<p>
 * Date: 2017-06-16
 */
public class GuangzhouRadio implements Radio {

  private List<RadioObserver> observers = Lists.newArrayList();
  private String msg;

  @Override
  public void registerObserver(RadioObserver observer) {
    observers.add(observer);
  }

  @Override
  public void delObserver(RadioObserver observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (RadioObserver observer : observers) {
      observer.listen(msg);
    }
  }

  public void pushMsg(String msg){
      this.msg = msg;
      notifyObservers();
  }


  public static void main(String[] args) {
      GuangzhouRadio gzRadio = new GuangzhouRadio();

      Observer1 observer1 = new Observer1(gzRadio);
      Observer2 observer2 = new Observer2(gzRadio);

      gzRadio.pushMsg("aaaa");

  }

}


