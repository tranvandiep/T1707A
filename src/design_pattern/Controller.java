/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_pattern;

/**
 *
 * @author Diep.Tran
 */
public class Controller {
    private static Controller instance = null;
    
    private Controller() {
    }
    
    public static Controller getInstance() {
        if(instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
    public void initStudent() {
        People student = new Student();
        //lam the nao de code nay chay dc
        if(student instanceof Student) {
            ((Student) student).showHello();
        }
    }
}
