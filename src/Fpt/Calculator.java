/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fpt;

/**
 *
 * @author Diep.Tran
 */
public class Calculator {
    public int x = 0;
    public static int y = 0;
    
    public static int divide(int x, int y) throws DeviceZeroException {
        if(y == 0) {
            throw new DeviceZeroException("May dang chia cho 0", "Sua ngay");
        } else {
            return y/x;
        }
    }
}
