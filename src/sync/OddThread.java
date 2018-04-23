/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sync;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diep.Tran
 */
public class OddThread extends CommonThread{
    Thread random;

    public Thread getRandom() {
        return random;
    }

    public void setRandom(Thread random) {
        this.random = random;
    }
    
    @Override
    public void run() {
        while (true) {            
            try {
                synchronized(this) {
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                    }
                }
                System.out.println("Odd : " + sharedData.getRandom());
                Thread.sleep(1);
                //notify random thread
                if(random != null) {
                    synchronized(random) {
                        random.notify();
                    }
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(OddThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
