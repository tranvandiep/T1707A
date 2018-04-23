/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diep.Tran
 */
public class CustomThread extends Thread{
    String name;
    int total;
    Thread syncThread;
    DataController dataController;
    
    public CustomThread(DataController dataController, String name, int total) {
        this.name = name;
        this.total = total;
        this.dataController = dataController;
    }

    public Thread getSyncThread() {
        return syncThread;
    }

    public void setSyncThread(Thread syncThread) {
        this.syncThread = syncThread;
    }
    
    @Override
    public void run() {
//        if(syncThread != null) {
//            try {
//                syncThread.join();
//            } catch (InterruptedException ex) {
//            }
//        }
        for (int i = 0; i < total; i++) {
            dataController.changeValue(1, false);
            
//            try {
//                System.out.println("Custom Thread >> " + name + " >> " + i);
//                Thread.sleep(1000);
//            } catch (InterruptedException ex) {
//            }
        }
    }
    
}
