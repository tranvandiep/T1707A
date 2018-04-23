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
public class Test {
    public static void main(String[] args) {
        DataController dataController = new DataController();
        
        System.out.println("start thread main");
        CustomThread thread1 = new CustomThread(dataController, "A", 1000);
        CustomThread thread2 = new CustomThread(dataController, "A", 1000);
        CustomThread thread3 = new CustomThread(dataController, "B", 1000);
        CustomThread thread4 = new CustomThread(dataController, "B", 1000);
        CustomThread thread5 = new CustomThread(dataController, "B", 1000);
        
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        
        System.out.println("finish thread main");
    }
}
