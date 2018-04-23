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
public class DeviceZeroException extends Exception{
    String description;
    
    public DeviceZeroException(String message, String description) {
        super(message);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
