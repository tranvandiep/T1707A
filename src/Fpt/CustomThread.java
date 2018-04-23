/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fpt;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diep.Tran
 */
public class CustomThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Custom Thread >> " + i);
            try {
                Thread.sleep(1000);
                if(i == 0) {
                    synchronized(this) {
                        wait();
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(CustomThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
