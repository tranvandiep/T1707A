/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fpt;

/**
 *
 * @author Diep.Tran
 */
public class ThreadTest {
    static Thread t;
    static CustomThread customThread;
    public static void main(String[] args) {
//        for (int i = 0; i < 20; i++) {
//                    System.out.println("Thread 1 : " + i);
//                }
//        for (int i = 0; i < 20; i++) {
//                    System.out.println("Thread 2 : " + i);
//                }
         t = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("coding... " + t.isAlive());
                    Thread.sleep(5000);
//                    synchronized(customThread) {
//                        customThread.notify();
//                    }
                    customThread.stop();
                    System.out.println("coding..." + t.isAlive());
                } catch (InterruptedException ex) {
                }
            }
        });
        t.start();
        
        customThread = new CustomThread();
        customThread.start();
        
        Thread t2 = new Thread(new CustomRunnable());
        t2.start();
    }
}
