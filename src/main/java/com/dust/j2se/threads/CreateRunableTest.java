package com.dust.j2se.threads;

/**
 * FileName: RunableTest
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2016-12-22
 */
public class CreateRunableTest implements Runnable {

    private int ticket = 5;

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            if(ticket > 0){
                ticket--;
                System.out.println(String.format("当前线程:%s,票数为:%d",Thread.currentThread().getName(),ticket));
            }else{
                System.out.println(String.format("当前线程:%s,票数为:%d",Thread.currentThread().getName(),ticket));
            }
        }
    }


    public static void main(String[] args) {

        CreateRunableTest runable = new CreateRunableTest();

        new Thread(runable).start();
        new Thread(runable).start();
        new Thread(runable).start();
        //Runnable 资源共享

    }

}
