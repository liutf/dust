package com.dust.j2se.threads;

/**
 * FileName: SleepInterrupt
 * Description:
 * Version: v1.0.0
 * Author: liutf
 * Date: 2016-12-22
 */
public class SleepInterrupt implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName());
            System.out.println("run() 准备开启休眠20s.");
            Thread.sleep(1000 * 20);
            System.out.println("run() 休眠恢复");
        } catch (InterruptedException e) {
            System.out.println("run() 休眠中被中断..");
            return;
        }
        System.out.println("in run() 正常退出");
    }

    public static void main(String[] args) {
        SleepInterrupt si = new SleepInterrupt();
        Thread t = new Thread(si);
        t.start();

        try {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println("main 休眠结束,发起中断");
            t.interrupt();
            System.out.println("main 中断完成");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
