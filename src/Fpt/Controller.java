/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fpt;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diep.Tran
 */
public class Controller<E extends Student> {
    List<E> eleList = new ArrayList<>();
    
    public void addElement(E e) {
        eleList.add(e);
        //code ...
        System.out.println(e.toString());
    }
    
    public E getElement(int index) {
        System.out.println(eleList.get(index).toString());
        return eleList.get(index);
    }
}
