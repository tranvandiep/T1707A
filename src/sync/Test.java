/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sync;

/**
 *
 * @author Diep.Tran
 */
public class Test {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        
        RadomThread random = new RadomThread();
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        
        random.setSharedData(sharedData);
        random.setOdd(odd);
        random.setEven(even);
        
        odd.setSharedData(sharedData);
        odd.setRandom(random);
        
        even.setSharedData(sharedData);
        even.setRandom(random);
        
        odd.start();
        even.start();
        random.start();
    }
}
