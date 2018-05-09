/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *
 * @author Diep.Tran
 */
public class Main {
    private static Logger logger = LogManager.getLogger(Main.class.getName());
    
    /**
     * args : y nghia ?????
     * @param args 
     */
    public static void main(String[] args) {
        Data data = new Data();
        Data.x++;
        data.y++;
        System.out.println("x = " + Data.x + "; y = " + data.y);
        
        Data data1 = new Data();
        Data.x++;
        data1.y++;
        System.out.println("x = " + Data.x + "; y = " + data1.y);
        
        logger.debug("end of progam");
    }
}
