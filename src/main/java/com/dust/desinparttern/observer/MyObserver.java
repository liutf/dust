package com.dust.desinparttern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * FileName: Observer<p>
 * Description:   <p>
 * Version: v1.0.0<p>
 * Author: liutf<p>
 * Date: 2017-06-16
 */
public class MyObserver implements Observer {

    public void listen(Observable observable){
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof MusicFm){
            String msg = ((MusicFm) o).getMsg();
        }
        if(o instanceof TrafficFm){
            String msg = ((TrafficFm) o).getMsg();
        }
    }


    public static void main(String[] args) {
        TrafficFm trafficFm = new TrafficFm();
        MusicFm musicFm = new MusicFm();

        MyObserver myObserver = new MyObserver();
        myObserver.listen(trafficFm);
        myObserver.listen(musicFm);

        trafficFm.push("欢迎收听交通频道");
        musicFm.push("欢迎收听音乐频道");

    }
}
