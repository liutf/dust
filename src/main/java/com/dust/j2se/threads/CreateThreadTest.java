package com.dust.j2se.threads;

/**
 * FileName: ThreadTest
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2016-12-22
 */
public class CreateThreadTest extends Thread{

    private int ticket = 5;

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            if(ticket > 0){
                System.out.println(String.format("当前线程:%s,票数为:%d",Thread.currentThread().getName(),ticket--));
            }
        }
    }


    public static void main(String[] args) {
        //未共享
        new CreateThreadTest().start();
        new CreateThreadTest().start();
        new CreateThreadTest().start();
    }
}
