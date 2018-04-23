/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sync;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diep.Tran
 */
public class RadomThread extends CommonThread{
    Thread odd;
    Thread even;

    public Thread getOdd() {
        return odd;
    }

    public void setOdd(Thread odd) {
        this.odd = odd;
    }

    public Thread getEven() {
        return even;
    }

    public void setEven(Thread even) {
        this.even = even;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int rad = new Random().nextInt(100);
            sharedData.setRandom(rad);
            
            if(rad % 2 == 0) {
                synchronized(even) {
                    even.notify();
                }
            } else {
                synchronized(odd) {
                    odd.notify();
                }
            }
            
            synchronized(this) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                }
            }
        }
        odd.stop();
        even.stop();
    }
    
}
