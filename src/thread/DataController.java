/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

/**
 *
 * @author Diep.Tran
 */
public class DataController {
    private int x = 1000;
    
    public DataController() {
        
    }
    
    public synchronized void changeValue(int changeValue, boolean isTest) {
        x += changeValue;
        System.out.println("x = " + x);
    }
    
    public synchronized void showX() {
        changeValue(1, false);
        System.out.println("x = " + x);
    }
}
