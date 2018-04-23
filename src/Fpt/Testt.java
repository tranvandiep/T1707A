/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fpt;

import java.io.UnsupportedEncodingException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

/**
 *
 * @author Diep.Tran
 */
public class Testt {
    public static void main(String[] args) throws UnsupportedEncodingException, DataFormatException {
        // Encode a String into bytes
        String input = "sinh vien aptech."; 
        byte[] inputObj = input.getBytes("UTF-8");
        // Compress the bytes
        byte[] output = new byte[100];
        Deflater deflater = new Deflater(); 
        deflater.setInput(inputObj);
        deflater.finish();
        int compressDataLength = deflater.deflate(output); 
        System.out.println(String.valueOf(output));
        
        // Decompress the bytes
        Inflater inflaterObj = new Inflater(); 
        inflaterObj.setInput(output, 0, output.length);
        byte[] resultObj = new byte[100];
        int resultLength = inflaterObj.inflate(resultObj);
        inflaterObj.end();
        // Decode the bytes into a String
        String strOutput = new String(resultObj, 0, resultLength, "UTF-8");
        System.out.println("Recovered string is: " + strOutput);
    }
}
